package grpc_shaded
package scalapb.grpc

import grpc_shaded.com.google.protobuf.InvalidProtocolBufferException
import scalapb.{GeneratedMessage, GeneratedMessageCompanion, Message}
import io.grpc.Metadata

object ProtoUtils {
  class ScalaPbMetadataMarshaller[T <: GeneratedMessage with Message[T]](
      companion: GeneratedMessageCompanion[T]
  ) extends Metadata.BinaryMarshaller[T] {
    override def toBytes(value: T): Array[Byte] = value.toByteArray

    override def parseBytes(serialized: Array[Byte]): T = {
      try {
        companion.parseFrom(serialized)
      } catch {
        case ipbe: InvalidProtocolBufferException =>
          throw new IllegalArgumentException(ipbe)
      }
    }
  }

  def metadataMarshaller[T <: GeneratedMessage with Message[T]](
      implicit companion: GeneratedMessageCompanion[T]
  ): Metadata.BinaryMarshaller[T] =
    new ScalaPbMetadataMarshaller(companion)

  def keyForProto[T <: GeneratedMessage with Message[T]](
      implicit companion: GeneratedMessageCompanion[T]
  ): Metadata.Key[T] =
    Metadata.Key.of(
      companion.javaDescriptor.getFullName + Metadata.BINARY_HEADER_SUFFIX,
      metadataMarshaller[T]
    )
}
