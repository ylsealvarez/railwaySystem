// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RailwayService2.proto

package generated.grpc.railwayservice2;

/**
 * <pre>
 *  message identifying a booking
 * </pre>
 *
 * Protobuf type {@code RailwayService2.BookingRequest}
 */
public  final class BookingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RailwayService2.BookingRequest)
    BookingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BookingRequest.newBuilder() to construct.
  private BookingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BookingRequest() {
    passengerID_ = 0;
    bookingID_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BookingRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            passengerID_ = input.readInt32();
            break;
          }
          case 16: {

            bookingID_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_BookingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_BookingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.railwayservice2.BookingRequest.class, generated.grpc.railwayservice2.BookingRequest.Builder.class);
  }

  public static final int PASSENGER_ID_FIELD_NUMBER = 1;
  private int passengerID_;
  /**
   * <code>int32 passenger_ID = 1;</code>
   */
  public int getPassengerID() {
    return passengerID_;
  }

  public static final int BOOKING_ID_FIELD_NUMBER = 2;
  private int bookingID_;
  /**
   * <code>int32 booking_ID = 2;</code>
   */
  public int getBookingID() {
    return bookingID_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (passengerID_ != 0) {
      output.writeInt32(1, passengerID_);
    }
    if (bookingID_ != 0) {
      output.writeInt32(2, bookingID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (passengerID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, passengerID_);
    }
    if (bookingID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, bookingID_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.grpc.railwayservice2.BookingRequest)) {
      return super.equals(obj);
    }
    generated.grpc.railwayservice2.BookingRequest other = (generated.grpc.railwayservice2.BookingRequest) obj;

    boolean result = true;
    result = result && (getPassengerID()
        == other.getPassengerID());
    result = result && (getBookingID()
        == other.getBookingID());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PASSENGER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPassengerID();
    hash = (37 * hash) + BOOKING_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBookingID();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice2.BookingRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.grpc.railwayservice2.BookingRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *  message identifying a booking
   * </pre>
   *
   * Protobuf type {@code RailwayService2.BookingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RailwayService2.BookingRequest)
      generated.grpc.railwayservice2.BookingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_BookingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_BookingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.railwayservice2.BookingRequest.class, generated.grpc.railwayservice2.BookingRequest.Builder.class);
    }

    // Construct using generated.grpc.railwayservice2.BookingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      passengerID_ = 0;

      bookingID_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_BookingRequest_descriptor;
    }

    @java.lang.Override
    public generated.grpc.railwayservice2.BookingRequest getDefaultInstanceForType() {
      return generated.grpc.railwayservice2.BookingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.railwayservice2.BookingRequest build() {
      generated.grpc.railwayservice2.BookingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.railwayservice2.BookingRequest buildPartial() {
      generated.grpc.railwayservice2.BookingRequest result = new generated.grpc.railwayservice2.BookingRequest(this);
      result.passengerID_ = passengerID_;
      result.bookingID_ = bookingID_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.grpc.railwayservice2.BookingRequest) {
        return mergeFrom((generated.grpc.railwayservice2.BookingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.railwayservice2.BookingRequest other) {
      if (other == generated.grpc.railwayservice2.BookingRequest.getDefaultInstance()) return this;
      if (other.getPassengerID() != 0) {
        setPassengerID(other.getPassengerID());
      }
      if (other.getBookingID() != 0) {
        setBookingID(other.getBookingID());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.grpc.railwayservice2.BookingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.railwayservice2.BookingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int passengerID_ ;
    /**
     * <code>int32 passenger_ID = 1;</code>
     */
    public int getPassengerID() {
      return passengerID_;
    }
    /**
     * <code>int32 passenger_ID = 1;</code>
     */
    public Builder setPassengerID(int value) {
      
      passengerID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 passenger_ID = 1;</code>
     */
    public Builder clearPassengerID() {
      
      passengerID_ = 0;
      onChanged();
      return this;
    }

    private int bookingID_ ;
    /**
     * <code>int32 booking_ID = 2;</code>
     */
    public int getBookingID() {
      return bookingID_;
    }
    /**
     * <code>int32 booking_ID = 2;</code>
     */
    public Builder setBookingID(int value) {
      
      bookingID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 booking_ID = 2;</code>
     */
    public Builder clearBookingID() {
      
      bookingID_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RailwayService2.BookingRequest)
  }

  // @@protoc_insertion_point(class_scope:RailwayService2.BookingRequest)
  private static final generated.grpc.railwayservice2.BookingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.railwayservice2.BookingRequest();
  }

  public static generated.grpc.railwayservice2.BookingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BookingRequest>
      PARSER = new com.google.protobuf.AbstractParser<BookingRequest>() {
    @java.lang.Override
    public BookingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BookingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BookingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BookingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.railwayservice2.BookingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

