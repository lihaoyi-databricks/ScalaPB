// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin

object PluginProto extends _root_.shaded.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.shaded.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.shaded.scalapb.GeneratedMessage]] =
    Seq[_root_.shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.shaded.scalapb.GeneratedMessage]](
      com.google.protobuf.compiler.plugin.Version,
      com.google.protobuf.compiler.plugin.CodeGeneratorRequest,
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse
    )
  private lazy val ProtoBytes: Array[Byte] =
      shaded.scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiVnb29nbGUvcHJvdG9idWYvY29tcGlsZXIvcGx1Z2luLnByb3RvEhhnb29nbGUucHJvdG9idWYuY29tcGlsZXIaIGdvb2dsZ
  S9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIpQBCgdWZXJzaW9uEiAKBW1ham9yGAEgASgFQgriPwcSBW1ham9yUgVtYWpvchIgC
  gVtaW5vchgCIAEoBUIK4j8HEgVtaW5vclIFbWlub3ISIAoFcGF0Y2gYAyABKAVCCuI/BxIFcGF0Y2hSBXBhdGNoEiMKBnN1ZmZpe
  BgEIAEoCUIL4j8IEgZzdWZmaXhSBnN1ZmZpeCK8AgoUQ29kZUdlbmVyYXRvclJlcXVlc3QSPQoQZmlsZV90b19nZW5lcmF0ZRgBI
  AMoCUIT4j8QEg5maWxlVG9HZW5lcmF0ZVIOZmlsZVRvR2VuZXJhdGUSLAoJcGFyYW1ldGVyGAIgASgJQg7iPwsSCXBhcmFtZXRlc
  lIJcGFyYW1ldGVyElMKCnByb3RvX2ZpbGUYDyADKAsyJC5nb29nbGUucHJvdG9idWYuRmlsZURlc2NyaXB0b3JQcm90b0IO4j8LE
  glwcm90b0ZpbGVSCXByb3RvRmlsZRJiChBjb21waWxlcl92ZXJzaW9uGAMgASgLMiEuZ29vZ2xlLnByb3RvYnVmLmNvbXBpbGVyL
  lZlcnNpb25CFOI/ERIPY29tcGlsZXJWZXJzaW9uUg9jb21waWxlclZlcnNpb24inAIKFUNvZGVHZW5lcmF0b3JSZXNwb25zZRIgC
  gVlcnJvchgBIAEoCUIK4j8HEgVlcnJvclIFZXJyb3ISUwoEZmlsZRgPIAMoCzI0Lmdvb2dsZS5wcm90b2J1Zi5jb21waWxlci5Db
  2RlR2VuZXJhdG9yUmVzcG9uc2UuRmlsZUIJ4j8GEgRmaWxlUgRmaWxlGosBCgRGaWxlEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZ
  VIEbmFtZRI8Cg9pbnNlcnRpb25fcG9pbnQYAiABKAlCE+I/EBIOaW5zZXJ0aW9uUG9pbnRSDmluc2VydGlvblBvaW50EiYKB2Nvb
  nRlbnQYDyABKAlCDOI/CRIHY29udGVudFIHY29udGVudEJnChxjb20uZ29vZ2xlLnByb3RvYnVmLmNvbXBpbGVyQgxQbHVnaW5Qc
  m90b3NaOWdpdGh1Yi5jb20vZ29sYW5nL3Byb3RvYnVmL3Byb3RvYy1nZW4tZ28vcGx1Z2luO3BsdWdpbl9nbw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.shaded.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.shaded.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor =
    com.google.protobuf.compiler.PluginProtos.getDescriptor()
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}