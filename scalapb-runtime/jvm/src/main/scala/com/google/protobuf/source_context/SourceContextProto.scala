// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.source_context

object SourceContextProto extends _root_.grpc_shaded.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.grpc_shaded.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] =
    Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]](
      grpc_shaded.com.google.protobuf.source_context.SourceContext
    )
  private lazy val ProtoBytes: Array[Byte] =
      grpc_shaded.scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiRnb29nbGUvcHJvdG9idWYvc291cmNlX2NvbnRleHQucHJvdG8SD2dvb2dsZS5wcm90b2J1ZiI7Cg1Tb3VyY2VDb250ZXh0E
  ioKCWZpbGVfbmFtZRgBIAEoCUIN4j8KEghmaWxlTmFtZVIIZmlsZU5hbWVClQEKE2NvbS5nb29nbGUucHJvdG9idWZCElNvdXJjZ
  UNvbnRleHRQcm90b1ABWkFnb29nbGUuZ29sYW5nLm9yZy9nZW5wcm90by9wcm90b2J1Zi9zb3VyY2VfY29udGV4dDtzb3VyY2VfY
  29udGV4dKICA0dQQqoCHkdvb2dsZS5Qcm90b2J1Zi5XZWxsS25vd25UeXBlc2IGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.FileDescriptor = {
    val scalaProto = grpc_shaded.com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.grpc_shaded.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor =
    grpc_shaded.com.google.protobuf.SourceContextProto.getDescriptor()
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}