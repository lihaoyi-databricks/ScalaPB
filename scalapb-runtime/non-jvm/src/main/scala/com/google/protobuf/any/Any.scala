// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package grpc_shaded.com.google.protobuf.any

/** `Any` contains an arbitrary serialized protocol buffer message along with a
  * URL that describes the type of the serialized message.
  *
  * Protobuf library provides support to pack/unpack Any values in the form
  * of utility functions or additional generated methods of the Any type.
  *
  * Example 1: Pack and unpack a message in C++.
  *
  *     Foo foo = ...;
  *     Any any;
  *     any.PackFrom(foo);
  *     ...
  *     if (any.UnpackTo(&amp;foo)) {
  *       ...
  *     }
  *
  * Example 2: Pack and unpack a message in Java.
  *
  *     Foo foo = ...;
  *     Any any = Any.pack(foo);
  *     ...
  *     if (any.is(Foo.class)) {
  *       foo = any.unpack(Foo.class);
  *     }
  *
  *  Example 3: Pack and unpack a message in Python.
  *
  *     foo = Foo(...)
  *     any = Any()
  *     any.Pack(foo)
  *     ...
  *     if any.Is(Foo.DESCRIPTOR):
  *       any.Unpack(foo)
  *       ...
  *
  *  Example 4: Pack and unpack a message in Go
  *
  *      foo := &amp;pb.Foo{...}
  *      any, err := ptypes.MarshalAny(foo)
  *      ...
  *      foo := &amp;pb.Foo{}
  *      if err := ptypes.UnmarshalAny(any, foo); err != nil {
  *        ...
  *      }
  *
  * The pack methods provided by protobuf library will by default use
  * 'type.googleapis.com/full.type.name' as the type URL and the unpack
  * methods only use the fully qualified type name after the last '/'
  * in the type URL, for example "foo.bar.com/x/y.z" will yield type
  * name "y.z".
  *
  *
  * JSON
  * ====
  * The JSON representation of an `Any` value uses the regular
  * representation of the deserialized, embedded message, with an
  * additional field `&#64;type` which contains the type URL. Example:
  *
  *     package google.profile;
  *     message Person {
  *       string first_name = 1;
  *       string last_name = 2;
  *     }
  *
  *     {
  *       "&#64;type": "type.googleapis.com/google.profile.Person",
  *       "firstName": &lt;string&gt;,
  *       "lastName": &lt;string&gt;
  *     }
  *
  * If the embedded message type is well-known and has a custom JSON
  * representation, that representation will be embedded adding a field
  * `value` which holds the custom JSON in addition to the `&#64;type`
  * field. Example (for message [google.protobuf.Duration][]):
  *
  *     {
  *       "&#64;type": "type.googleapis.com/google.protobuf.Duration",
  *       "value": "1.212s"
  *     }
  *
  * @param typeUrl
  *   A URL/resource name that uniquely identifies the type of the serialized
  *   protocol buffer message. This string must contain at least
  *   one "/" character. The last segment of the URL's path must represent
  *   the fully qualified name of the type (as in
  *   `path/google.protobuf.Duration`). The name should be in a canonical form
  *   (e.g., leading "." is not accepted).
  *  
  *   In practice, teams usually precompile into the binary all types that they
  *   expect it to use in the context of Any. However, for URLs which use the
  *   scheme `http`, `https`, or no scheme, one can optionally set up a type
  *   server that maps type URLs to message definitions as follows:
  *  
  *   * If no scheme is provided, `https` is assumed.
  *   * An HTTP GET on the URL must yield a [google.protobuf.Type][]
  *     value in binary format, or produce an error.
  *   * Applications are allowed to cache lookup results based on the
  *     URL, or have them precompiled into a binary to avoid any
  *     lookup. Therefore, binary compatibility needs to be preserved
  *     on changes to types. (Use versioned type names to manage
  *     breaking changes.)
  *  
  *   Note: this functionality is not currently available in the official
  *   protobuf release, and it is not used for type URLs beginning with
  *   type.googleapis.com.
  *  
  *   Schemes other than `http`, `https` (or the empty scheme) might be
  *   used with implementation specific semantics.
  * @param value
  *   Must be a valid serialized protocol buffer of the above specified type.
  */
@SerialVersionUID(0L)
final case class Any(
    typeUrl: _root_.scala.Predef.String = "",
    value: _root_.grpc_shaded.com.google.protobuf.ByteString = _root_.grpc_shaded.com.google.protobuf.ByteString.EMPTY
    ) extends grpc_shaded.scalapb.GeneratedMessage with grpc_shaded.scalapb.Message[Any] with grpc_shaded.scalapb.lenses.Updatable[Any] with _root_.grpc_shaded.scalapb.AnyMethods {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = typeUrl
        if (__value != "") {
          __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = value
        if (__value != _root_.grpc_shaded.com.google.protobuf.ByteString.EMPTY) {
          __size += _root_.grpc_shaded.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
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
        val __v = typeUrl
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = value
        if (__v != _root_.grpc_shaded.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.grpc_shaded.com.google.protobuf.CodedInputStream): grpc_shaded.com.google.protobuf.any.Any = {
      var __typeUrl = this.typeUrl
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __typeUrl = _input__.readString()
          case 18 =>
            __value = _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      grpc_shaded.com.google.protobuf.any.Any(
          typeUrl = __typeUrl,
          value = __value
      )
    }
    def withTypeUrl(__v: _root_.scala.Predef.String): Any = copy(typeUrl = __v)
    def withValue(__v: _root_.grpc_shaded.com.google.protobuf.ByteString): Any = copy(value = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = typeUrl
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = value
          if (__t != _root_.grpc_shaded.com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    def getField(__field: _root_.grpc_shaded.scalapb.descriptors.FieldDescriptor): _root_.grpc_shaded.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.grpc_shaded.scalapb.descriptors.PString(typeUrl)
        case 2 => _root_.grpc_shaded.scalapb.descriptors.PByteString(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.grpc_shaded.scalapb.TextFormat.printToUnicodeString(this)
    def companion = grpc_shaded.com.google.protobuf.any.Any
}

object Any extends grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.any.Any] with grpc_shaded.scalapb.AnyCompanionMethods {
  implicit def messageCompanion: grpc_shaded.scalapb.GeneratedMessageCompanion[grpc_shaded.com.google.protobuf.any.Any] with grpc_shaded.scalapb.AnyCompanionMethods = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.grpc_shaded.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): grpc_shaded.com.google.protobuf.any.Any = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    grpc_shaded.com.google.protobuf.any.Any(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), _root_.grpc_shaded.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.grpc_shaded.com.google.protobuf.ByteString]
    )
  }
  implicit def messageReads: _root_.grpc_shaded.scalapb.descriptors.Reads[grpc_shaded.com.google.protobuf.any.Any] = _root_.grpc_shaded.scalapb.descriptors.Reads{
    case _root_.grpc_shaded.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      grpc_shaded.com.google.protobuf.any.Any(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.grpc_shaded.com.google.protobuf.ByteString]).getOrElse(_root_.grpc_shaded.com.google.protobuf.ByteString.EMPTY)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.grpc_shaded.com.google.protobuf.Descriptors.Descriptor = AnyProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.grpc_shaded.scalapb.descriptors.Descriptor = AnyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.grpc_shaded.scalapb.GeneratedMessageCompanion[_ <: _root_.grpc_shaded.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.grpc_shaded.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = grpc_shaded.com.google.protobuf.any.Any(
  )
  implicit class AnyLens[UpperPB](_l: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, grpc_shaded.com.google.protobuf.any.Any]) extends _root_.grpc_shaded.scalapb.lenses.ObjectLens[UpperPB, grpc_shaded.com.google.protobuf.any.Any](_l) {
    def typeUrl: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.typeUrl)((c_, f_) => c_.copy(typeUrl = f_))
    def value: _root_.grpc_shaded.scalapb.lenses.Lens[UpperPB, _root_.grpc_shaded.com.google.protobuf.ByteString] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val TYPE_URL_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  def of(
    typeUrl: _root_.scala.Predef.String,
    value: _root_.grpc_shaded.com.google.protobuf.ByteString
  ): _root_.grpc_shaded.com.google.protobuf.any.Any = _root_.grpc_shaded.com.google.protobuf.any.Any(
    typeUrl,
    value
  )
}
