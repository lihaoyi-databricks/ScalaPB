// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.wrappers

/** Wrapper message for `string`.
  *
  * The JSON representation for `StringValue` is JSON string.
  *
  * @param value
  *   The string value.
  */
@SerialVersionUID(0L)
final case class StringValue(
    value: _root_.scala.Predef.String = ""
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[StringValue] with grpc_shaded.scalapb.lenses.Updatable[StringValue] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = value
        if (__value != "") {
          __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.grpc_shaded.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = value
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.wrappers.StringValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __value = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      grpc_shaded.com.google.protobuf.wrappers.StringValue(
          value = __value
      )
    }
    def withValue(__v: _root_.scala.Predef.String): StringValue = copy(value = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.grpc_shaded.scalapb.descriptors.PString(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.wrappers.StringValue
}

object StringValue extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.wrappers.StringValue] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.wrappers.StringValue, grpc_shaded.com.google.protobuf.StringValue] {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.wrappers.StringValue] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.wrappers.StringValue, grpc_shaded.com.google.protobuf.StringValue] = this
  def toJavaProto(scalaPbSource: grpc_shaded.com.google.protobuf.wrappers.StringValue): grpc_shaded.com.google.protobuf.StringValue = {
    val javaPbOut = grpc_shaded.com.google.protobuf.StringValue.newBuilder
    javaPbOut.setValue(scalaPbSource.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: grpc_shaded.com.google.protobuf.StringValue): grpc_shaded.com.google.protobuf.wrappers.StringValue = grpc_shaded.com.google.protobuf.wrappers.StringValue(
    value = javaPbSource.getValue
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.wrappers.StringValue = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc_shaded.com.google.protobuf.wrappers.StringValue(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.wrappers.StringValue] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.wrappers.StringValue(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.wrappers.StringValue(
  )
  implicit class StringValueLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.wrappers.StringValue]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.wrappers.StringValue](_l) {
    def value: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
  def of(
    value: _root_.scala.Predef.String
  ): _root_.grpc_shaded.com.google.protobuf.wrappers.StringValue = _root_.grpc_shaded.com.google.protobuf.wrappers.StringValue(
    value
  )
}
