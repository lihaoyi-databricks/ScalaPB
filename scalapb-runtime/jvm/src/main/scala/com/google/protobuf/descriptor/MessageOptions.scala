// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package grpc_shaded.com.google.protobuf.descriptor
import _root_.grpc_shaded.scalapb.internal.compat.JavaConverters._

/** @param messageSetWireFormat
  *   Set true to use the old proto1 MessageSet wire format for extensions.
  *   This is provided for backwards-compatibility with the MessageSet wire
  *   format.  You should not use this for any other reason:  It's less
  *   efficient, has fewer features, and is more complicated.
  *  
  *   The message must be defined exactly as follows:
  *     message Foo {
  *       option message_set_wire_format = true;
  *       extensions 4 to max;
  *     }
  *   Note that the message cannot have any defined fields; MessageSets only
  *   have extensions.
  *  
  *   All extensions of your type must be singular messages; e.g. they cannot
  *   be int32s, enums, or repeated messages.
  *  
  *   Because this is an option, the above two restrictions are not enforced by
  *   the protocol compiler.
  * @param noStandardDescriptorAccessor
  *   Disables the generation of the standard "descriptor()" accessor, which can
  *   conflict with a field of the same name.  This is meant to make migration
  *   from proto1 easier; new code should avoid fields named "descriptor".
  * @param deprecated
  *   Is this message deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the message, or it will be completely ignored; in the very least,
  *   this is a formalization for deprecating messages.
  * @param mapEntry
  *   Whether the message is an automatically generated map entry type for the
  *   maps field.
  *  
  *   For maps fields:
  *       map&lt;KeyType, ValueType&gt; map_field = 1;
  *   The parsed descriptor looks like:
  *       message MapFieldEntry {
  *           option map_entry = true;
  *           optional KeyType key = 1;
  *           optional ValueType value = 2;
  *       }
  *       repeated MapFieldEntry map_field = 1;
  *  
  *   Implementations may choose not to generate the map_entry=true message, but
  *   use a native map in the target language to hold the keys and values.
  *   The reflection APIs in such implementions still need to work as
  *   if the field is a repeated message field.
  *  
  *   NOTE: Do not set the option in .proto files. Always use the maps syntax
  *   instead. The option should only be implicitly set by the proto compiler
  *   parser.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class MessageOptions(
    messageSetWireFormat: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    noStandardDescriptorAccessor: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    deprecated: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    mapEntry: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    uninterpretedOption: _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.Seq.empty,
    unknownFields: _root_.grpc_shaded.scalapb.UnknownFieldSet = _root_.grpc_shaded.scalapb.UnknownFieldSet()
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[MessageOptions] with grpc_shaded.scalapb.lenses.Updatable[MessageOptions] with _root_.grpc_shaded.scalapb.ExtendableMessage[MessageOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (messageSetWireFormat.isDefined) {
        val __value = messageSetWireFormat.get
        __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeBoolSize(1, __value)
      };
      if (noStandardDescriptorAccessor.isDefined) {
        val __value = noStandardDescriptorAccessor.get
        __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      if (deprecated.isDefined) {
        val __value = deprecated.get
        __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
      };
      if (mapEntry.isDefined) {
        val __value = mapEntry.get
        __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeBoolSize(7, __value)
      };
      uninterpretedOption.foreach { __item =>
        val __value = __item
        __size += 2 + _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
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
      messageSetWireFormat.foreach { __v =>
        val __m = __v
        _output__.writeBool(1, __m)
      };
      noStandardDescriptorAccessor.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      deprecated.foreach { __v =>
        val __m = __v
        _output__.writeBool(3, __m)
      };
      mapEntry.foreach { __v =>
        val __m = __v
        _output__.writeBool(7, __m)
      };
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.descriptor.MessageOptions = {
      var __messageSetWireFormat = this.messageSetWireFormat
      var __noStandardDescriptorAccessor = this.noStandardDescriptorAccessor
      var __deprecated = this.deprecated
      var __mapEntry = this.mapEntry
      val __uninterpretedOption = (_root_.scala.collection.immutable.Vector.newBuilder[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      val _unknownFields__ = new _root_.grpc_shaded.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __messageSetWireFormat = Option(_input__.readBool())
          case 16 =>
            __noStandardDescriptorAccessor = Option(_input__.readBool())
          case 24 =>
            __deprecated = Option(_input__.readBool())
          case 56 =>
            __mapEntry = Option(_input__.readBool())
          case 7994 =>
            __uninterpretedOption += _root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      grpc_shaded.com.google.protobuf.descriptor.MessageOptions(
          messageSetWireFormat = __messageSetWireFormat,
          noStandardDescriptorAccessor = __noStandardDescriptorAccessor,
          deprecated = __deprecated,
          mapEntry = __mapEntry,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = _unknownFields__.result()
      )
    }
    def getMessageSetWireFormat: _root_.scala.Boolean = messageSetWireFormat.getOrElse(false)
    def clearMessageSetWireFormat: MessageOptions = copy(messageSetWireFormat = _root_.scala.None)
    def withMessageSetWireFormat(__v: _root_.scala.Boolean): MessageOptions = copy(messageSetWireFormat = Option(__v))
    def getNoStandardDescriptorAccessor: _root_.scala.Boolean = noStandardDescriptorAccessor.getOrElse(false)
    def clearNoStandardDescriptorAccessor: MessageOptions = copy(noStandardDescriptorAccessor = _root_.scala.None)
    def withNoStandardDescriptorAccessor(__v: _root_.scala.Boolean): MessageOptions = copy(noStandardDescriptorAccessor = Option(__v))
    def getDeprecated: _root_.scala.Boolean = deprecated.getOrElse(false)
    def clearDeprecated: MessageOptions = copy(deprecated = _root_.scala.None)
    def withDeprecated(__v: _root_.scala.Boolean): MessageOptions = copy(deprecated = Option(__v))
    def getMapEntry: _root_.scala.Boolean = mapEntry.getOrElse(false)
    def clearMapEntry: MessageOptions = copy(mapEntry = _root_.scala.None)
    def withMapEntry(__v: _root_.scala.Boolean): MessageOptions = copy(mapEntry = Option(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.Seq.empty)
    def addUninterpretedOption(__vs: grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption*): MessageOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: Iterable[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]): MessageOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]): MessageOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.grpc_shaded.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.grpc_shaded.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => messageSetWireFormat.orNull
        case 2 => noStandardDescriptorAccessor.orNull
        case 3 => deprecated.orNull
        case 7 => mapEntry.orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => messageSetWireFormat.map(_root_.grpc_shaded.scalapb.descriptors.PBoolean).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 2 => noStandardDescriptorAccessor.map(_root_.grpc_shaded.scalapb.descriptors.PBoolean).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 3 => deprecated.map(_root_.grpc_shaded.scalapb.descriptors.PBoolean).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 7 => mapEntry.map(_root_.grpc_shaded.scalapb.descriptors.PBoolean).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 999 => _root_.grpc_shaded.scalapb.descriptors.PRepeated(uninterpretedOption.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.descriptor.MessageOptions
}

object MessageOptions extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.descriptor.MessageOptions] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.descriptor.MessageOptions, grpc_shaded.com.google.protobuf.DescriptorProtos.MessageOptions] {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.descriptor.MessageOptions] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.descriptor.MessageOptions, grpc_shaded.com.google.protobuf.DescriptorProtos.MessageOptions] = this
  def toJavaProto(scalaPbSource: grpc_shaded.com.google.protobuf.descriptor.MessageOptions): grpc_shaded.com.google.protobuf.DescriptorProtos.MessageOptions = {
    val javaPbOut = grpc_shaded.com.google.protobuf.DescriptorProtos.MessageOptions.newBuilder
    scalaPbSource.messageSetWireFormat.foreach(javaPbOut.setMessageSetWireFormat)
    scalaPbSource.noStandardDescriptorAccessor.foreach(javaPbOut.setNoStandardDescriptorAccessor)
    scalaPbSource.deprecated.foreach(javaPbOut.setDeprecated)
    scalaPbSource.mapEntry.foreach(javaPbOut.setMapEntry)
    javaPbOut.addAllUninterpretedOption(scalaPbSource.uninterpretedOption.iterator.map(grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption.toJavaProto).toIterable.asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: grpc_shaded.com.google.protobuf.DescriptorProtos.MessageOptions): grpc_shaded.com.google.protobuf.descriptor.MessageOptions = grpc_shaded.com.google.protobuf.descriptor.MessageOptions(
    messageSetWireFormat = if (javaPbSource.hasMessageSetWireFormat) Some(javaPbSource.getMessageSetWireFormat.booleanValue) else _root_.scala.None,
    noStandardDescriptorAccessor = if (javaPbSource.hasNoStandardDescriptorAccessor) Some(javaPbSource.getNoStandardDescriptorAccessor.booleanValue) else _root_.scala.None,
    deprecated = if (javaPbSource.hasDeprecated) Some(javaPbSource.getDeprecated.booleanValue) else _root_.scala.None,
    mapEntry = if (javaPbSource.hasMapEntry) Some(javaPbSource.getMapEntry.booleanValue) else _root_.scala.None,
    uninterpretedOption = javaPbSource.getUninterpretedOptionList.asScala.iterator.map(grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption.fromJavaProto).toSeq
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.descriptor.MessageOptions = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc_shaded.com.google.protobuf.descriptor.MessageOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.descriptor.MessageOptions] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.descriptor.MessageOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(11)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(11)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.descriptor.MessageOptions(
  )
  implicit class MessageOptionsLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.descriptor.MessageOptions]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.descriptor.MessageOptions](_l) {
    def messageSetWireFormat: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getMessageSetWireFormat)((c_, f_) => c_.copy(messageSetWireFormat = Option(f_)))
    def optionalMessageSetWireFormat: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.messageSetWireFormat)((c_, f_) => c_.copy(messageSetWireFormat = f_))
    def noStandardDescriptorAccessor: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoStandardDescriptorAccessor)((c_, f_) => c_.copy(noStandardDescriptorAccessor = Option(f_)))
    def optionalNoStandardDescriptorAccessor: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noStandardDescriptorAccessor)((c_, f_) => c_.copy(noStandardDescriptorAccessor = f_))
    def deprecated: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Option(f_)))
    def optionalDeprecated: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def mapEntry: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getMapEntry)((c_, f_) => c_.copy(mapEntry = Option(f_)))
    def optionalMapEntry: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.mapEntry)((c_, f_) => c_.copy(mapEntry = f_))
    def uninterpretedOption: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1
  final val NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2
  final val DEPRECATED_FIELD_NUMBER = 3
  final val MAP_ENTRY_FIELD_NUMBER = 7
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
  def of(
    messageSetWireFormat: _root_.scala.Option[_root_.scala.Boolean],
    noStandardDescriptorAccessor: _root_.scala.Option[_root_.scala.Boolean],
    deprecated: _root_.scala.Option[_root_.scala.Boolean],
    mapEntry: _root_.scala.Option[_root_.scala.Boolean],
    uninterpretedOption: _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption],
    unknownFields: _root_.grpc_shaded.scalapb.UnknownFieldSet
  ): _root_.grpc_shaded.com.google.protobuf.descriptor.MessageOptions = _root_.grpc_shaded.com.google.protobuf.descriptor.MessageOptions(
    messageSetWireFormat,
    noStandardDescriptorAccessor,
    deprecated,
    mapEntry,
    uninterpretedOption,
    unknownFields
  )
}
