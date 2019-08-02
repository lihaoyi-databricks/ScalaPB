// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.api
import _root_.grpc_shaded.scalapb.internal.compat.JavaConverters._

/** Api is a light-weight descriptor for an API Interface.
  *
  * Interfaces are also described as "protocol buffer services" in some contexts,
  * such as by the "service" keyword in a .proto file, but they are different
  * from API Services, which represent a concrete implementation of an interface
  * as opposed to simply a description of methods and bindings. They are also
  * sometimes simply referred to as "APIs" in other contexts, such as the name of
  * this message itself. See https://cloud.google.com/apis/design/glossary for
  * detailed terminology.
  *
  * @param name
  *   The fully qualified name of this interface, including package name
  *   followed by the interface's simple name.
  * @param methods
  *   The methods of this interface, in unspecified order.
  * @param options
  *   Any metadata attached to the interface.
  * @param version
  *   A version string for this interface. If specified, must have the form
  *   `major-version.minor-version`, as in `1.10`. If the minor version is
  *   omitted, it defaults to zero. If the entire version field is empty, the
  *   major version is derived from the package name, as outlined below. If the
  *   field is not empty, the version in the package name will be verified to be
  *   consistent with what is provided here.
  *  
  *   The versioning schema uses [semantic
  *   versioning](http://semver.org) where the major version number
  *   indicates a breaking change and the minor version an additive,
  *   non-breaking change. Both version numbers are signals to users
  *   what to expect from different versions, and should be carefully
  *   chosen based on the product plan.
  *  
  *   The major version is also reflected in the package name of the
  *   interface, which must end in `v&lt;major-version&gt;`, as in
  *   `google.feature.v1`. For major versions 0 and 1, the suffix can
  *   be omitted. Zero major versions must only be used for
  *   experimental, non-GA interfaces.
  * @param sourceContext
  *   Source context for the protocol buffer service represented by this
  *   message.
  * @param mixins
  *   Included interfaces. See [Mixin][].
  * @param syntax
  *   The source syntax of the service.
  */
@SerialVersionUID(0L)
final case class Api(
    name: _root_.scala.Predef.String = "",
    methods: _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Method] = _root_.scala.Seq.empty,
    options: _root_.scala.Seq[grpc_shaded.com.google.protobuf.`type`.OptionProto] = _root_.scala.Seq.empty,
    version: _root_.scala.Predef.String = "",
    sourceContext: _root_.scala.Option[grpc_shaded.com.google.protobuf.source_context.SourceContext] = _root_.scala.None,
    mixins: _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Mixin] = _root_.scala.Seq.empty,
    syntax: grpc_shaded.com.google.protobuf.`type`.Syntax = grpc_shaded.com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[Api] with grpc_shaded.scalapb.lenses.Updatable[Api] {
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
      methods.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      options.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = version
        if (__value != "") {
          __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      if (sourceContext.isDefined) {
        val __value = sourceContext.get
        __size += 1 + _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      mixins.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = syntax
        if (__value != grpc_shaded.com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2) {
          __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeEnumSize(7, __value.value)
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
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      methods.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = version
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      sourceContext.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      mixins.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = syntax
        if (__v != grpc_shaded.com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2) {
          _output__.writeEnum(7, __v.value)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.api.Api = {
      var __name = this.name
      val __methods = (_root_.scala.collection.immutable.Vector.newBuilder[grpc_shaded.com.google.protobuf.api.Method] ++= this.methods)
      val __options = (_root_.scala.collection.immutable.Vector.newBuilder[grpc_shaded.com.google.protobuf.`type`.OptionProto] ++= this.options)
      var __version = this.version
      var __sourceContext = this.sourceContext
      val __mixins = (_root_.scala.collection.immutable.Vector.newBuilder[grpc_shaded.com.google.protobuf.api.Mixin] ++= this.mixins)
      var __syntax = this.syntax
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __methods += _root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, grpc_shaded.com.google.protobuf.api.Method.defaultInstance)
          case 26 =>
            __options += _root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, grpc_shaded.com.google.protobuf.`type`.OptionProto.defaultInstance)
          case 34 =>
            __version = _input__.readString()
          case 42 =>
            __sourceContext = Option(_root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, __sourceContext.getOrElse(grpc_shaded.com.google.protobuf.source_context.SourceContext.defaultInstance)))
          case 50 =>
            __mixins += _root_.grpc_shaded.scalapb.LiteParser.readMessage(_input__, grpc_shaded.com.google.protobuf.api.Mixin.defaultInstance)
          case 56 =>
            __syntax = grpc_shaded.com.google.protobuf.`type`.Syntax.fromValue(_input__.readEnum())
          case tag => _input__.skipField(tag)
        }
      }
      grpc_shaded.com.google.protobuf.api.Api(
          name = __name,
          methods = __methods.result(),
          options = __options.result(),
          version = __version,
          sourceContext = __sourceContext,
          mixins = __mixins.result(),
          syntax = __syntax
      )
    }
    def withName(__v: _root_.scala.Predef.String): Api = copy(name = __v)
    def clearMethods = copy(methods = _root_.scala.Seq.empty)
    def addMethods(__vs: grpc_shaded.com.google.protobuf.api.Method*): Api = addAllMethods(__vs)
    def addAllMethods(__vs: Iterable[grpc_shaded.com.google.protobuf.api.Method]): Api = copy(methods = methods ++ __vs)
    def withMethods(__v: _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Method]): Api = copy(methods = __v)
    def clearOptions = copy(options = _root_.scala.Seq.empty)
    def addOptions(__vs: grpc_shaded.com.google.protobuf.`type`.OptionProto*): Api = addAllOptions(__vs)
    def addAllOptions(__vs: Iterable[grpc_shaded.com.google.protobuf.`type`.OptionProto]): Api = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.Seq[grpc_shaded.com.google.protobuf.`type`.OptionProto]): Api = copy(options = __v)
    def withVersion(__v: _root_.scala.Predef.String): Api = copy(version = __v)
    def getSourceContext: grpc_shaded.com.google.protobuf.source_context.SourceContext = sourceContext.getOrElse(grpc_shaded.com.google.protobuf.source_context.SourceContext.defaultInstance)
    def clearSourceContext: Api = copy(sourceContext = _root_.scala.None)
    def withSourceContext(__v: grpc_shaded.com.google.protobuf.source_context.SourceContext): Api = copy(sourceContext = Option(__v))
    def clearMixins = copy(mixins = _root_.scala.Seq.empty)
    def addMixins(__vs: grpc_shaded.com.google.protobuf.api.Mixin*): Api = addAllMixins(__vs)
    def addAllMixins(__vs: Iterable[grpc_shaded.com.google.protobuf.api.Mixin]): Api = copy(mixins = mixins ++ __vs)
    def withMixins(__v: _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Mixin]): Api = copy(mixins = __v)
    def withSyntax(__v: grpc_shaded.com.google.protobuf.`type`.Syntax): Api = copy(syntax = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => methods
        case 3 => options
        case 4 => {
          val __t = version
          if (__t != "") __t else null
        }
        case 5 => sourceContext.orNull
        case 6 => mixins
        case 7 => {
          val __t = syntax.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.grpc_shaded.scalapb.descriptors.PString(name)
        case 2 => _root_.grpc_shaded.scalapb.descriptors.PRepeated(methods.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.grpc_shaded.scalapb.descriptors.PRepeated(options.iterator.map(_.toPMessage).toVector)
        case 4 => _root_.grpc_shaded.scalapb.descriptors.PString(version)
        case 5 => sourceContext.map(_.toPMessage).getOrElse(_root_.grpc_shaded.scalapb.descriptors.PEmpty)
        case 6 => _root_.grpc_shaded.scalapb.descriptors.PRepeated(mixins.iterator.map(_.toPMessage).toVector)
        case 7 => _root_.grpc_shaded.scalapb.descriptors.PEnum(syntax.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.api.Api
}

object Api extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.api.Api] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.api.Api, grpc_shaded.com.google.protobuf.Api] {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.api.Api] with grpc_shaded.scalapb.JavaProtoSupport[grpc_shaded.com.google.protobuf.api.Api, grpc_shaded.com.google.protobuf.Api] = this
  def toJavaProto(scalaPbSource: grpc_shaded.com.google.protobuf.api.Api): grpc_shaded.com.google.protobuf.Api = {
    val javaPbOut = grpc_shaded.com.google.protobuf.Api.newBuilder
    javaPbOut.setName(scalaPbSource.name)
    javaPbOut.addAllMethods(scalaPbSource.methods.iterator.map(grpc_shaded.com.google.protobuf.api.Method.toJavaProto).toIterable.asJava)
    javaPbOut.addAllOptions(scalaPbSource.options.iterator.map(grpc_shaded.com.google.protobuf.`type`.OptionProto.toJavaProto).toIterable.asJava)
    javaPbOut.setVersion(scalaPbSource.version)
    scalaPbSource.sourceContext.map(grpc_shaded.com.google.protobuf.source_context.SourceContext.toJavaProto).foreach(javaPbOut.setSourceContext)
    javaPbOut.addAllMixins(scalaPbSource.mixins.iterator.map(grpc_shaded.com.google.protobuf.api.Mixin.toJavaProto).toIterable.asJava)
    javaPbOut.setSyntaxValue(scalaPbSource.syntax.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: grpc_shaded.com.google.protobuf.Api): grpc_shaded.com.google.protobuf.api.Api = grpc_shaded.com.google.protobuf.api.Api(
    name = javaPbSource.getName,
    methods = javaPbSource.getMethodsList.asScala.iterator.map(grpc_shaded.com.google.protobuf.api.Method.fromJavaProto).toSeq,
    options = javaPbSource.getOptionsList.asScala.iterator.map(grpc_shaded.com.google.protobuf.`type`.OptionProto.fromJavaProto).toSeq,
    version = javaPbSource.getVersion,
    sourceContext = if (javaPbSource.hasSourceContext) Some(grpc_shaded.com.google.protobuf.source_context.SourceContext.fromJavaProto(javaPbSource.getSourceContext)) else _root_.scala.None,
    mixins = javaPbSource.getMixinsList.asScala.iterator.map(grpc_shaded.com.google.protobuf.api.Mixin.fromJavaProto).toSeq,
    syntax = grpc_shaded.com.google.protobuf.`type`.Syntax.fromValue(javaPbSource.getSyntaxValue.intValue)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.api.Api = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc_shaded.com.google.protobuf.api.Api(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Method]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[grpc_shaded.com.google.protobuf.`type`.OptionProto]],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[grpc_shaded.com.google.protobuf.source_context.SourceContext]],
      __fieldsMap.getOrElse(__fields.get(5), Nil).asInstanceOf[_root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Mixin]],
      grpc_shaded.com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.getOrElse(__fields.get(6), grpc_shaded.com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.javaValueDescriptor).asInstanceOf[_root_.grpc_shaded.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber)
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.api.Api] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.api.Api(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Method]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[grpc_shaded.com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[grpc_shaded.com.google.protobuf.source_context.SourceContext]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Mixin]]).getOrElse(_root_.scala.Seq.empty),
        grpc_shaded.com.google.protobuf.`type`.Syntax.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.grpc_shaded.scalapb.descriptors.EnumValueDescriptor]).getOrElse(grpc_shaded.com.google.protobuf.`type`.Syntax.SYNTAX_PROTO2.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = ApiProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = ApiProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = grpc_shaded.com.google.protobuf.api.Method
      case 3 => __out = grpc_shaded.com.google.protobuf.`type`.OptionProto
      case 5 => __out = grpc_shaded.com.google.protobuf.source_context.SourceContext
      case 6 => __out = grpc_shaded.com.google.protobuf.api.Mixin
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 7 => grpc_shaded.com.google.protobuf.`type`.Syntax
    }
  }
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.api.Api(
  )
  implicit class ApiLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.api.Api]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.api.Api](_l) {
    def name: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def methods: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Method]] = field(_.methods)((c_, f_) => c_.copy(methods = f_))
    def options: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[grpc_shaded.com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def version: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def sourceContext: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.source_context.SourceContext] = field(_.getSourceContext)((c_, f_) => c_.copy(sourceContext = Option(f_)))
    def optionalSourceContext: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[grpc_shaded.com.google.protobuf.source_context.SourceContext]] = field(_.sourceContext)((c_, f_) => c_.copy(sourceContext = f_))
    def mixins: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Mixin]] = field(_.mixins)((c_, f_) => c_.copy(mixins = f_))
    def syntax: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.`type`.Syntax] = field(_.syntax)((c_, f_) => c_.copy(syntax = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val METHODS_FIELD_NUMBER = 2
  final val OPTIONS_FIELD_NUMBER = 3
  final val VERSION_FIELD_NUMBER = 4
  final val SOURCE_CONTEXT_FIELD_NUMBER = 5
  final val MIXINS_FIELD_NUMBER = 6
  final val SYNTAX_FIELD_NUMBER = 7
  def of(
    name: _root_.scala.Predef.String,
    methods: _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Method],
    options: _root_.scala.Seq[grpc_shaded.com.google.protobuf.`type`.OptionProto],
    version: _root_.scala.Predef.String,
    sourceContext: _root_.scala.Option[grpc_shaded.com.google.protobuf.source_context.SourceContext],
    mixins: _root_.scala.Seq[grpc_shaded.com.google.protobuf.api.Mixin],
    syntax: grpc_shaded.com.google.protobuf.`type`.Syntax
  ): _root_.grpc_shaded.com.google.protobuf.api.Api = _root_.grpc_shaded.com.google.protobuf.api.Api(
    name,
    methods,
    options,
    version,
    sourceContext,
    mixins,
    syntax
  )
}
