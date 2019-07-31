// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

/** Wrapper message for `double`.
  *
  * The JSON representation for `DoubleValue` is JSON number.
  *
  * @param value
  *   The double value.
  */
@SerialVersionUID(0L)
final case class DoubleValue(
    value: _root_.scala.Double = 0.0
    ) extends shaded.scalapb.GeneratedMessage with shaded.scalapb.Message[DoubleValue] with shaded.scalapb.lenses.Updatable[DoubleValue] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = value
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(1, __value)
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
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = value
        if (__v != 0.0) {
          _output__.writeDouble(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.DoubleValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 9 =>
            __value = _input__.readDouble()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.DoubleValue(
          value = __value
      )
    }
    def withValue(__v: _root_.scala.Double): DoubleValue = copy(value = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != 0.0) __t else null
        }
      }
    }
    def getField(__field: _root_.shaded.scalapb.descriptors.FieldDescriptor): _root_.shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.shaded.scalapb.descriptors.PDouble(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.DoubleValue
}

object DoubleValue extends shaded.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.DoubleValue] {
  implicit def messageCompanion: shaded.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.DoubleValue] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.wrappers.DoubleValue = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.wrappers.DoubleValue(
      __fieldsMap.getOrElse(__fields.get(0), 0.0).asInstanceOf[_root_.scala.Double]
    )
  }
  implicit def messageReads: _root_.shaded.scalapb.descriptors.Reads[com.google.protobuf.wrappers.DoubleValue] = _root_.shaded.scalapb.descriptors.Reads{
    case _root_.shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.wrappers.DoubleValue(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Double]).getOrElse(0.0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.shaded.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.shaded.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.shaded.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.wrappers.DoubleValue(
  )
  implicit class DoubleValueLens[UpperPB](_l: _root_.shaded.scalapb.lenses.Lens[UpperPB, com.google.protobuf.wrappers.DoubleValue]) extends _root_.shaded.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.DoubleValue](_l) {
    def value: _root_.shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
  def of(
    value: _root_.scala.Double
  ): _root_.com.google.protobuf.wrappers.DoubleValue = _root_.com.google.protobuf.wrappers.DoubleValue(
    value
  )
}
