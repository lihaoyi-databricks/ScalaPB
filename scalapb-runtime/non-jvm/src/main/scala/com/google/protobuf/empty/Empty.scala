// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.empty

/** A generic empty message that you can re-use to avoid defining duplicated
  * empty messages in your APIs. A typical example is to use it as the request
  * or the response type of an API method. For instance:
  *
  *     service Foo {
  *       rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty);
  *     }
  *
  * The JSON representation for `Empty` is empty JSON object `{}`.
  */
@SerialVersionUID(0L)
final case class Empty(
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[Empty] with grpc_shaded.scalapb.lenses.Updatable[Empty] {
    final override def serializedSize: _root_.scala.Int = 0
    def writeTo(`_output__`: _root_.grpc_shaded.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.empty.Empty = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case tag => _input__.skipField(tag)
        }
      }
      grpc_shaded.com.google.protobuf.empty.Empty(
      )
    }
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = throw new MatchError(__fieldNumber)
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = throw new MatchError(__field)
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.empty.Empty
}

object Empty extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.empty.Empty] {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.empty.Empty] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.empty.Empty = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    grpc_shaded.com.google.protobuf.empty.Empty(
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.empty.Empty] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.empty.Empty(
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = EmptyProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = EmptyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.empty.Empty(
  )
  implicit class EmptyLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.empty.Empty]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.empty.Empty](_l) {
  }
  def of(
  ): _root_.grpc_shaded.com.google.protobuf.empty.Empty = _root_.grpc_shaded.com.google.protobuf.empty.Empty(
  )
}
