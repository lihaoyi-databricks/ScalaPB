// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.`type`

object TypeProto extends _root_.grpc_shaded.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.grpc_shaded.scalapb.GeneratedFileObject] = Seq(
    grpc_shaded.com.google.protobuf.any.AnyProto,
    grpc_shaded.com.google.protobuf.source_context.SourceContextProto
  )
  lazy val messagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] =
    Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]](
      grpc_shaded.com.google.protobuf.`type`.Type,
      grpc_shaded.com.google.protobuf.`type`.Field,
      grpc_shaded.com.google.protobuf.`type`.Enum,
      grpc_shaded.com.google.protobuf.`type`.EnumValue,
      grpc_shaded.com.google.protobuf.`type`.OptionProto
    )
  private lazy val ProtoBytes: Array[Byte] =
      grpc_shaded.scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """Chpnb29nbGUvcHJvdG9idWYvdHlwZS5wcm90bxIPZ29vZ2xlLnByb3RvYnVmGhlnb29nbGUvcHJvdG9idWYvYW55LnByb3RvG
  iRnb29nbGUvcHJvdG9idWYvc291cmNlX2NvbnRleHQucHJvdG8i4QIKBFR5cGUSHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuY
  W1lEjsKBmZpZWxkcxgCIAMoCzIWLmdvb2dsZS5wcm90b2J1Zi5GaWVsZEIL4j8IEgZmaWVsZHNSBmZpZWxkcxIjCgZvbmVvZnMYA
  yADKAlCC+I/CBIGb25lb2ZzUgZvbmVvZnMSPwoHb3B0aW9ucxgEIAMoCzIXLmdvb2dsZS5wcm90b2J1Zi5PcHRpb25CDOI/CRIHb
  3B0aW9uc1IHb3B0aW9ucxJZCg5zb3VyY2VfY29udGV4dBgFIAEoCzIeLmdvb2dsZS5wcm90b2J1Zi5Tb3VyY2VDb250ZXh0QhLiP
  w8SDXNvdXJjZUNvbnRleHRSDXNvdXJjZUNvbnRleHQSPAoGc3ludGF4GAYgASgOMhcuZ29vZ2xlLnByb3RvYnVmLlN5bnRheEIL4
  j8IEgZzeW50YXhSBnN5bnRheCLFBwoFRmllbGQSOgoEa2luZBgBIAEoDjIbLmdvb2dsZS5wcm90b2J1Zi5GaWVsZC5LaW5kQgniP
  wYSBGtpbmRSBGtpbmQSVgoLY2FyZGluYWxpdHkYAiABKA4yIi5nb29nbGUucHJvdG9idWYuRmllbGQuQ2FyZGluYWxpdHlCEOI/D
  RILY2FyZGluYWxpdHlSC2NhcmRpbmFsaXR5EiMKBm51bWJlchgDIAEoBUIL4j8IEgZudW1iZXJSBm51bWJlchIdCgRuYW1lGAQgA
  SgJQgniPwYSBG5hbWVSBG5hbWUSJwoIdHlwZV91cmwYBiABKAlCDOI/CRIHdHlwZVVybFIHdHlwZVVybBIwCgtvbmVvZl9pbmRle
  BgHIAEoBUIP4j8MEgpvbmVvZkluZGV4UgpvbmVvZkluZGV4EiMKBnBhY2tlZBgIIAEoCEIL4j8IEgZwYWNrZWRSBnBhY2tlZBI/C
  gdvcHRpb25zGAkgAygLMhcuZ29vZ2xlLnByb3RvYnVmLk9wdGlvbkIM4j8JEgdvcHRpb25zUgdvcHRpb25zEioKCWpzb25fbmFtZ
  RgKIAEoCUIN4j8KEghqc29uTmFtZVIIanNvbk5hbWUSNgoNZGVmYXVsdF92YWx1ZRgLIAEoCUIR4j8OEgxkZWZhdWx0VmFsdWVSD
  GRlZmF1bHRWYWx1ZSLIAgoES2luZBIQCgxUWVBFX1VOS05PV04QABIPCgtUWVBFX0RPVUJMRRABEg4KClRZUEVfRkxPQVQQAhIOC
  gpUWVBFX0lOVDY0EAMSDwoLVFlQRV9VSU5UNjQQBBIOCgpUWVBFX0lOVDMyEAUSEAoMVFlQRV9GSVhFRDY0EAYSEAoMVFlQRV9GS
  VhFRDMyEAcSDQoJVFlQRV9CT09MEAgSDwoLVFlQRV9TVFJJTkcQCRIOCgpUWVBFX0dST1VQEAoSEAoMVFlQRV9NRVNTQUdFEAsSD
  goKVFlQRV9CWVRFUxAMEg8KC1RZUEVfVUlOVDMyEA0SDQoJVFlQRV9FTlVNEA4SEQoNVFlQRV9TRklYRUQzMhAPEhEKDVRZUEVfU
  0ZJWEVENjQQEBIPCgtUWVBFX1NJTlQzMhAREg8KC1RZUEVfU0lOVDY0EBIidAoLQ2FyZGluYWxpdHkSFwoTQ0FSRElOQUxJVFlfV
  U5LTk9XThAAEhgKFENBUkRJTkFMSVRZX09QVElPTkFMEAESGAoUQ0FSRElOQUxJVFlfUkVRVUlSRUQQAhIYChRDQVJESU5BTElUW
  V9SRVBFQVRFRBADIskCCgRFbnVtEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRJICgllbnVtdmFsdWUYAiADKAsyGi5nb
  29nbGUucHJvdG9idWYuRW51bVZhbHVlQg7iPwsSCWVudW12YWx1ZVIJZW51bXZhbHVlEj8KB29wdGlvbnMYAyADKAsyFy5nb29nb
  GUucHJvdG9idWYuT3B0aW9uQgziPwkSB29wdGlvbnNSB29wdGlvbnMSWQoOc291cmNlX2NvbnRleHQYBCABKAsyHi5nb29nbGUuc
  HJvdG9idWYuU291cmNlQ29udGV4dEIS4j8PEg1zb3VyY2VDb250ZXh0Ug1zb3VyY2VDb250ZXh0EjwKBnN5bnRheBgFIAEoDjIXL
  mdvb2dsZS5wcm90b2J1Zi5TeW50YXhCC+I/CBIGc3ludGF4UgZzeW50YXgikAEKCUVudW1WYWx1ZRIdCgRuYW1lGAEgASgJQgniP
  wYSBG5hbWVSBG5hbWUSIwoGbnVtYmVyGAIgASgFQgviPwgSBm51bWJlclIGbnVtYmVyEj8KB29wdGlvbnMYAyADKAsyFy5nb29nb
  GUucHJvdG9idWYuT3B0aW9uQgziPwkSB29wdGlvbnNSB29wdGlvbnMiXwoGT3B0aW9uEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZ
  VIEbmFtZRI2CgV2YWx1ZRgCIAEoCzIULmdvb2dsZS5wcm90b2J1Zi5BbnlCCuI/BxIFdmFsdWVSBXZhbHVlKi4KBlN5bnRheBIRC
  g1TWU5UQVhfUFJPVE8yEAASEQoNU1lOVEFYX1BST1RPMxABQn0KE2NvbS5nb29nbGUucHJvdG9idWZCCVR5cGVQcm90b1ABWi9nb
  29nbGUuZ29sYW5nLm9yZy9nZW5wcm90by9wcm90b2J1Zi9wdHlwZTtwdHlwZfgBAaICA0dQQqoCHkdvb2dsZS5Qcm90b2J1Zi5XZ
  WxsS25vd25UeXBlc2IGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.FileDescriptor = {
    val scalaProto = grpc_shaded.com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.grpc_shaded.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = grpc_shaded.com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      grpc_shaded.com.google.protobuf.any.AnyProto.javaDescriptor,
      grpc_shaded.com.google.protobuf.source_context.SourceContextProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: grpc_shaded.com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}