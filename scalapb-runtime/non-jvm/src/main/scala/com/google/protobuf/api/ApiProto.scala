// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.api

object ApiProto extends _root_.shaded.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.shaded.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.source_context.SourceContextProto,
    com.google.protobuf.`type`.TypeProto
  )
  lazy val messagesCompanions: Seq[_root_.shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.shaded.scalapb.GeneratedMessage]] =
    Seq[_root_.shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.shaded.scalapb.GeneratedMessage]](
      com.google.protobuf.api.Api,
      com.google.protobuf.api.Method,
      com.google.protobuf.api.Mixin
    )
  private lazy val ProtoBytes: Array[Byte] =
      shaded.scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Chlnb29nbGUvcHJvdG9idWYvYXBpLnByb3RvEg9nb29nbGUucHJvdG9idWYaJGdvb2dsZS9wcm90b2J1Zi9zb3VyY2VfY29ud
  GV4dC5wcm90bxoaZ29vZ2xlL3Byb3RvYnVmL3R5cGUucHJvdG8ipAMKA0FwaRIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hb
  WUSPwoHbWV0aG9kcxgCIAMoCzIXLmdvb2dsZS5wcm90b2J1Zi5NZXRob2RCDOI/CRIHbWV0aG9kc1IHbWV0aG9kcxI/CgdvcHRpb
  25zGAMgAygLMhcuZ29vZ2xlLnByb3RvYnVmLk9wdGlvbkIM4j8JEgdvcHRpb25zUgdvcHRpb25zEiYKB3ZlcnNpb24YBCABKAlCD
  OI/CRIHdmVyc2lvblIHdmVyc2lvbhJZCg5zb3VyY2VfY29udGV4dBgFIAEoCzIeLmdvb2dsZS5wcm90b2J1Zi5Tb3VyY2VDb250Z
  Xh0QhLiPw8SDXNvdXJjZUNvbnRleHRSDXNvdXJjZUNvbnRleHQSOwoGbWl4aW5zGAYgAygLMhYuZ29vZ2xlLnByb3RvYnVmLk1pe
  GluQgviPwgSBm1peGluc1IGbWl4aW5zEjwKBnN5bnRheBgHIAEoDjIXLmdvb2dsZS5wcm90b2J1Zi5TeW50YXhCC+I/CBIGc3lud
  GF4UgZzeW50YXgisgMKBk1ldGhvZBIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSPQoQcmVxdWVzdF90eXBlX3VybBgCI
  AEoCUIT4j8QEg5yZXF1ZXN0VHlwZVVybFIOcmVxdWVzdFR5cGVVcmwSQgoRcmVxdWVzdF9zdHJlYW1pbmcYAyABKAhCFeI/EhIQc
  mVxdWVzdFN0cmVhbWluZ1IQcmVxdWVzdFN0cmVhbWluZxJAChFyZXNwb25zZV90eXBlX3VybBgEIAEoCUIU4j8REg9yZXNwb25zZ
  VR5cGVVcmxSD3Jlc3BvbnNlVHlwZVVybBJFChJyZXNwb25zZV9zdHJlYW1pbmcYBSABKAhCFuI/ExIRcmVzcG9uc2VTdHJlYW1pb
  mdSEXJlc3BvbnNlU3RyZWFtaW5nEj8KB29wdGlvbnMYBiADKAsyFy5nb29nbGUucHJvdG9idWYuT3B0aW9uQgziPwkSB29wdGlvb
  nNSB29wdGlvbnMSPAoGc3ludGF4GAcgASgOMhcuZ29vZ2xlLnByb3RvYnVmLlN5bnRheEIL4j8IEgZzeW50YXhSBnN5bnRheCJFC
  gVNaXhpbhIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSHQoEcm9vdBgCIAEoCUIJ4j8GEgRyb290UgRyb290QnUKE2Nvb
  S5nb29nbGUucHJvdG9idWZCCEFwaVByb3RvUAFaK2dvb2dsZS5nb2xhbmcub3JnL2dlbnByb3RvL3Byb3RvYnVmL2FwaTthcGmiA
  gNHUEKqAh5Hb29nbGUuUHJvdG9idWYuV2VsbEtub3duVHlwZXNiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.shaded.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.shaded.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.google.protobuf.source_context.SourceContextProto.javaDescriptor,
      com.google.protobuf.`type`.TypeProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}