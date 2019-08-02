// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package grpc_shaded.com.google.protobuf.descriptor

/** @param deprecated
  *   Is this method deprecated?
  *   Depending on the target platform, this can emit Deprecated annotations
  *   for the method, or it will be completely ignored; in the very least,
  *   this is a formalization for deprecating methods.
  * @param uninterpretedOption
  *   The parser stores options it doesn't recognize here. See above.
  */
@SerialVersionUID(0L)
final case class MethodOptions(
    deprecated: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    idempotencyLevel: _root_.scala.Option[grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel] = _root_.scala.None,
    uninterpretedOption: _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption] = _root_.scala.Seq.empty,
    unknownFields: _root_.grpc_shaded.scalapb.UnknownFieldSet = _root_.grpc_shaded.scalapb.UnknownFieldSet()
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[MethodOptions] with grpc_shaded.scalapb.lenses.Updatable[MethodOptions] with _root_.grpc_shaded.scalapb.ExtendableMessage[MethodOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (deprecated.isDefined) {
        val __value = deprecated.get
        __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeBoolSize(33, __value)
      };
      if (idempotencyLevel.isDefined) {
        val __value = idempotencyLevel.get
        __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeEnumSize(34, __value.value)
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
      deprecated.foreach { __v =>
        val __m = __v
        _output__.writeBool(33, __m)
      };
      idempotencyLevel.foreach { __v =>
        val __m = __v
        _output__.writeEnum(34, __m.value)
      };
      uninterpretedOption.foreach { __v =>
        val __m = __v
        _output__.writeTag(999, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.descriptor.MethodOptions = {
      var __deprecated = this.deprecated
      var __idempotencyLevel = this.idempotencyLevel
      val __uninterpretedOption = (_root_.scala.collection.immutable.Vector.newBuilder[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption] ++= this.uninterpretedOption)
      val _unknownFields__ = new _root_.grpc_shaded.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 264 =>
            __deprecated = Option(_input__.readBool())
          case 272 =>
            __idempotencyLevel = Option(grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(_input__.readEnum()))
          case 7994 =>
            __uninterpretedOption += _root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption.defaultInstance)
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      grpc_shaded.com.google.protobuf.descriptor.MethodOptions(
          deprecated = __deprecated,
          idempotencyLevel = __idempotencyLevel,
          uninterpretedOption = __uninterpretedOption.result(),
          unknownFields = _unknownFields__.result()
      )
    }
    def getDeprecated: _root_.scala.Boolean = deprecated.getOrElse(false)
    def clearDeprecated: MethodOptions = copy(deprecated = _root_.scala.None)
    def withDeprecated(__v: _root_.scala.Boolean): MethodOptions = copy(deprecated = Option(__v))
    def getIdempotencyLevel: grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel = idempotencyLevel.getOrElse(grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.IDEMPOTENCY_UNKNOWN)
    def clearIdempotencyLevel: MethodOptions = copy(idempotencyLevel = _root_.scala.None)
    def withIdempotencyLevel(__v: grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel): MethodOptions = copy(idempotencyLevel = Option(__v))
    def clearUninterpretedOption = copy(uninterpretedOption = _root_.scala.Seq.empty)
    def addUninterpretedOption(__vs: grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption*): MethodOptions = addAllUninterpretedOption(__vs)
    def addAllUninterpretedOption(__vs: Iterable[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]): MethodOptions = copy(uninterpretedOption = uninterpretedOption ++ __vs)
    def withUninterpretedOption(__v: _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]): MethodOptions = copy(uninterpretedOption = __v)
    def withUnknownFields(__v: _root_.grpc_shaded.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.grpc_shaded.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 33 => deprecated.orNull
        case 34 => idempotencyLevel.map(_.javaValueDescriptor).orNull
        case 999 => uninterpretedOption
      }
    }
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 33 => deprecated.map(_root_.grpc_shaded.scalapb.descriptors.PBoolean).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 34 => idempotencyLevel.map(__e => _root_.grpc_shaded.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 999 => _root_.grpc_shaded.scalapb.descriptors.PRepeated(uninterpretedOption.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.descriptor.MethodOptions
}

object MethodOptions extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.descriptor.MethodOptions] {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.descriptor.MethodOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.descriptor.MethodOptions = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc_shaded.com.google.protobuf.descriptor.MethodOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.grpc_shaded.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(__e.getNumber)),
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]]
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.descriptor.MethodOptions] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.descriptor.MethodOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(33).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(34).get).flatMap(_.as[_root_.scala.Option[_root_.grpc_shaded.scalapb.descriptors.EnumValueDescriptor]]).map(__e => grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(999).get).map(_.as[_root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(17)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(17)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 999 => __out = grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 34 => grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel
    }
  }
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.descriptor.MethodOptions(
  )
  /** Is this method side-effect-free (or safe in HTTP parlance), or idempotent,
    * or neither? HTTP based RPC implementation may choose GET verb for safe
    * methods, and PUT verb for idempotent methods instead of the default POST.
    */
  sealed trait IdempotencyLevel extends _root_.grpc_shaded.scalapb.GeneratedEnum {
    type EnumType = IdempotencyLevel
    def isIdempotencyUnknown: _root_.scala.Boolean = false
    def isNoSideEffects: _root_.scala.Boolean = false
    def isIdempotent: _root_.scala.Boolean = false
    def companion: _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[IdempotencyLevel] = grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel
  }
  
  object IdempotencyLevel extends _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[IdempotencyLevel] {
    implicit def enumCompanion: _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[IdempotencyLevel] = this
    @SerialVersionUID(0L)
    case object IDEMPOTENCY_UNKNOWN extends IdempotencyLevel {
      val value = 0
      val index = 0
      val name = "IDEMPOTENCY_UNKNOWN"
      override def isIdempotencyUnknown: _root_.scala.Boolean = true
    }
    
    /** implies idempotent
      */
    @SerialVersionUID(0L)
    case object NO_SIDE_EFFECTS extends IdempotencyLevel {
      val value = 1
      val index = 1
      val name = "NO_SIDE_EFFECTS"
      override def isNoSideEffects: _root_.scala.Boolean = true
    }
    
    /** idempotent, but may have side effects
      */
    @SerialVersionUID(0L)
    case object IDEMPOTENT extends IdempotencyLevel {
      val value = 2
      val index = 2
      val name = "IDEMPOTENT"
      override def isIdempotent: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends IdempotencyLevel with _root_.grpc_shaded.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(IDEMPOTENCY_UNKNOWN, NO_SIDE_EFFECTS, IDEMPOTENT)
    def fromValue(value: _root_.scala.Int): IdempotencyLevel = value match {
      case 0 => IDEMPOTENCY_UNKNOWN
      case 1 => NO_SIDE_EFFECTS
      case 2 => IDEMPOTENT
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.EnumDescriptor = grpc_shaded.com.google.protobuf.descriptor.MethodOptions.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.EnumDescriptor = grpc_shaded.com.google.protobuf.descriptor.MethodOptions.scalaDescriptor.enums(0)
  }
  implicit class MethodOptionsLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.descriptor.MethodOptions]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.descriptor.MethodOptions](_l) {
    def deprecated: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getDeprecated)((c_, f_) => c_.copy(deprecated = Option(f_)))
    def optionalDeprecated: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.deprecated)((c_, f_) => c_.copy(deprecated = f_))
    def idempotencyLevel: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel] = field(_.getIdempotencyLevel)((c_, f_) => c_.copy(idempotencyLevel = Option(f_)))
    def optionalIdempotencyLevel: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel]] = field(_.idempotencyLevel)((c_, f_) => c_.copy(idempotencyLevel = f_))
    def uninterpretedOption: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption]] = field(_.uninterpretedOption)((c_, f_) => c_.copy(uninterpretedOption = f_))
  }
  final val DEPRECATED_FIELD_NUMBER = 33
  final val IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34
  final val UNINTERPRETED_OPTION_FIELD_NUMBER = 999
  def of(
    deprecated: _root_.scala.Option[_root_.scala.Boolean],
    idempotencyLevel: _root_.scala.Option[grpc_shaded.com.google.protobuf.descriptor.MethodOptions.IdempotencyLevel],
    uninterpretedOption: _root_.scala.Seq[grpc_shaded.com.google.protobuf.descriptor.UninterpretedOption],
    unknownFields: _root_.grpc_shaded.scalapb.UnknownFieldSet
  ): _root_.grpc_shaded.com.google.protobuf.descriptor.MethodOptions = _root_.grpc_shaded.com.google.protobuf.descriptor.MethodOptions(
    deprecated,
    idempotencyLevel,
    uninterpretedOption,
    unknownFields
  )
}
