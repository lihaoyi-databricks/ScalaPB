// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.wrappers

object WrappersProto extends _root_.grpc_shaded.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.grpc_shaded.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] =
    Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]](
      grpc_shaded.com.google.protobuf.wrappers.DoubleValue,
      grpc_shaded.com.google.protobuf.wrappers.FloatValue,
      grpc_shaded.com.google.protobuf.wrappers.Int64Value,
      grpc_shaded.com.google.protobuf.wrappers.UInt64Value,
      grpc_shaded.com.google.protobuf.wrappers.Int32Value,
      grpc_shaded.com.google.protobuf.wrappers.UInt32Value,
      grpc_shaded.com.google.protobuf.wrappers.BoolValue,
      grpc_shaded.com.google.protobuf.wrappers.StringValue,
      grpc_shaded.com.google.protobuf.wrappers.BytesValue
    )
  private lazy val ProtoBytes: Array[Byte] =
      grpc_shaded.scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Ch5nb29nbGUvcHJvdG9idWYvd3JhcHBlcnMucHJvdG8SD2dvb2dsZS5wcm90b2J1ZiIvCgtEb3VibGVWYWx1ZRIgCgV2YWx1Z
  RgBIAEoAUIK4j8HEgV2YWx1ZVIFdmFsdWUiLgoKRmxvYXRWYWx1ZRIgCgV2YWx1ZRgBIAEoAkIK4j8HEgV2YWx1ZVIFdmFsdWUiL
  goKSW50NjRWYWx1ZRIgCgV2YWx1ZRgBIAEoA0IK4j8HEgV2YWx1ZVIFdmFsdWUiLwoLVUludDY0VmFsdWUSIAoFdmFsdWUYASABK
  ARCCuI/BxIFdmFsdWVSBXZhbHVlIi4KCkludDMyVmFsdWUSIAoFdmFsdWUYASABKAVCCuI/BxIFdmFsdWVSBXZhbHVlIi8KC1VJb
  nQzMlZhbHVlEiAKBXZhbHVlGAEgASgNQgriPwcSBXZhbHVlUgV2YWx1ZSItCglCb29sVmFsdWUSIAoFdmFsdWUYASABKAhCCuI/B
  xIFdmFsdWVSBXZhbHVlIi8KC1N0cmluZ1ZhbHVlEiAKBXZhbHVlGAEgASgJQgriPwcSBXZhbHVlUgV2YWx1ZSIuCgpCeXRlc1Zhb
  HVlEiAKBXZhbHVlGAEgASgMQgriPwcSBXZhbHVlUgV2YWx1ZUJ8ChNjb20uZ29vZ2xlLnByb3RvYnVmQg1XcmFwcGVyc1Byb3RvU
  AFaKmdpdGh1Yi5jb20vZ29sYW5nL3Byb3RvYnVmL3B0eXBlcy93cmFwcGVyc/gBAaICA0dQQqoCHkdvb2dsZS5Qcm90b2J1Zi5XZ
  WxsS25vd25UeXBlc2IGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.FileDescriptor = {
    val scalaProto = grpc_shaded.com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.grpc_shaded.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = grpc_shaded.com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}