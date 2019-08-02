// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.`type`

/** A protocol buffer option, which can be attached to a message, field,
  * enumeration, etc.
  *
  * @param name
  *   The option's name. For protobuf built-in options (options defined in
  *   descriptor.proto), this is the short name. For example, `"map_entry"`.
  *   For custom options, it should be the fully-qualified name. For example,
  *   `"google.api.http"`.
  * @param value
  *   The option's value packed in an Any message. If the value is a primitive,
  *   the corresponding wrapper type defined in google/protobuf/wrappers.proto
  *   should be used. If the value is an enum, it should be stored as an int32
  *   value using the google.protobuf.Int32Value type.
  */
@SerialVersionUID(0L)
final case class OptionProto(
    name: _root_.scala.Predef.String = "",
    value: _root_.scala.Option[grpc_shaded.com.google.protobuf.any.Any] = _root_.scala.None
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[OptionProto] with grpc_shaded.scalapb.lenses.Updatable[OptionProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (value.isDefined) {
        val __value = value.get
        __size += 1 + _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      value.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.`type`.OptionProto = {
      var __name = this.name
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __value = Option(_root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(grpc_shaded.com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      grpc_shaded.com.google.protobuf.`type`.OptionProto(
          name = __name,
          value = __value
      )
    }
    def withName(__v: _root_.scala.Predef.String): OptionProto = copy(name = __v)
    def getValue: grpc_shaded.com.google.protobuf.any.Any = value.getOrElse(grpc_shaded.com.google.protobuf.any.Any.defaultInstance)
    def clearValue: OptionProto = copy(value = _root_.scala.None)
    def withValue(__v: grpc_shaded.com.google.protobuf.any.Any): OptionProto = copy(value = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => value.orNull
      }
    }
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.grpc_shaded.scalapb.descriptors.PString(name)
        case 2 => value.map(_.toPMessage).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.`type`.OptionProto
}

object OptionProto extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.`type`.OptionProto] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.`type`.OptionProto, grpc_shaded.com.google.protobuf.Option] {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.`type`.OptionProto] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.`type`.OptionProto, grpc_shaded.com.google.protobuf.Option] = this
  def toJavaProto(scalaPbSource: grpc_shaded.com.google.protobuf.`type`.OptionProto): grpc_shaded.com.google.protobuf.Option = {
    val javaPbOut = grpc_shaded.com.google.protobuf.Option.newBuilder
    javaPbOut.setName(scalaPbSource.name)
    scalaPbSource.value.map(grpc_shaded.com.google.protobuf.any.Any.toJavaProto).foreach(javaPbOut.setValue)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: grpc_shaded.com.google.protobuf.Option): grpc_shaded.com.google.protobuf.`type`.OptionProto = grpc_shaded.com.google.protobuf.`type`.OptionProto(
    name = javaPbSource.getName,
    value = if (javaPbSource.hasValue) Some(grpc_shaded.com.google.protobuf.any.Any.fromJavaProto(javaPbSource.getValue)) else _root_.scala.None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.`type`.OptionProto = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc_shaded.com.google.protobuf.`type`.OptionProto(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[grpc_shaded.com.google.protobuf.any.Any]]
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.`type`.OptionProto] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.`type`.OptionProto(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[grpc_shaded.com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = TypeProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = TypeProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = grpc_shaded.com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.`type`.OptionProto(
  )
  implicit class OptionProtoLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.`type`.OptionProto]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.`type`.OptionProto](_l) {
    def name: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def value: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.any.Any] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
    def optionalValue: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[grpc_shaded.com.google.protobuf.any.Any]] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  def of(
    name: _root_.scala.Predef.String,
    value: _root_.scala.Option[grpc_shaded.com.google.protobuf.any.Any]
  ): _root_.grpc_shaded.com.google.protobuf.`type`.OptionProto = _root_.grpc_shaded.com.google.protobuf.`type`.OptionProto(
    name,
    value
  )
}
