// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RailwayService2.proto

package generated.grpc.railwayservice2;

/**
 * <pre>
 * The response message containing answer from the server
 * </pre>
 *
 * Protobuf type {@code RailwayService2.AvailabilityResponse}
 */
public  final class AvailabilityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RailwayService2.AvailabilityResponse)
    AvailabilityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AvailabilityResponse.newBuilder() to construct.
  private AvailabilityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AvailabilityResponse() {
    availableSeats_ = 0;
    occupiedSeats_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AvailabilityResponse(
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

            availableSeats_ = input.readInt32();
            break;
          }
          case 16: {

            occupiedSeats_ = input.readInt32();
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
    return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_AvailabilityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_AvailabilityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.railwayservice2.AvailabilityResponse.class, generated.grpc.railwayservice2.AvailabilityResponse.Builder.class);
  }

  public static final int AVAILABLE_SEATS_FIELD_NUMBER = 1;
  private int availableSeats_;
  /**
   * <code>int32 available_seats = 1;</code>
   */
  public int getAvailableSeats() {
    return availableSeats_;
  }

  public static final int OCCUPIED_SEATS_FIELD_NUMBER = 2;
  private int occupiedSeats_;
  /**
   * <code>int32 occupied_seats = 2;</code>
   */
  public int getOccupiedSeats() {
    return occupiedSeats_;
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
    if (availableSeats_ != 0) {
      output.writeInt32(1, availableSeats_);
    }
    if (occupiedSeats_ != 0) {
      output.writeInt32(2, occupiedSeats_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (availableSeats_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, availableSeats_);
    }
    if (occupiedSeats_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, occupiedSeats_);
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
    if (!(obj instanceof generated.grpc.railwayservice2.AvailabilityResponse)) {
      return super.equals(obj);
    }
    generated.grpc.railwayservice2.AvailabilityResponse other = (generated.grpc.railwayservice2.AvailabilityResponse) obj;

    boolean result = true;
    result = result && (getAvailableSeats()
        == other.getAvailableSeats());
    result = result && (getOccupiedSeats()
        == other.getOccupiedSeats());
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
    hash = (37 * hash) + AVAILABLE_SEATS_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableSeats();
    hash = (37 * hash) + OCCUPIED_SEATS_FIELD_NUMBER;
    hash = (53 * hash) + getOccupiedSeats();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice2.AvailabilityResponse parseFrom(
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
  public static Builder newBuilder(generated.grpc.railwayservice2.AvailabilityResponse prototype) {
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
   * The response message containing answer from the server
   * </pre>
   *
   * Protobuf type {@code RailwayService2.AvailabilityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RailwayService2.AvailabilityResponse)
      generated.grpc.railwayservice2.AvailabilityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_AvailabilityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_AvailabilityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.railwayservice2.AvailabilityResponse.class, generated.grpc.railwayservice2.AvailabilityResponse.Builder.class);
    }

    // Construct using generated.grpc.railwayservice2.AvailabilityResponse.newBuilder()
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
      availableSeats_ = 0;

      occupiedSeats_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.railwayservice2.RailwayService2Impl.internal_static_RailwayService2_AvailabilityResponse_descriptor;
    }

    @java.lang.Override
    public generated.grpc.railwayservice2.AvailabilityResponse getDefaultInstanceForType() {
      return generated.grpc.railwayservice2.AvailabilityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.railwayservice2.AvailabilityResponse build() {
      generated.grpc.railwayservice2.AvailabilityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.railwayservice2.AvailabilityResponse buildPartial() {
      generated.grpc.railwayservice2.AvailabilityResponse result = new generated.grpc.railwayservice2.AvailabilityResponse(this);
      result.availableSeats_ = availableSeats_;
      result.occupiedSeats_ = occupiedSeats_;
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
      if (other instanceof generated.grpc.railwayservice2.AvailabilityResponse) {
        return mergeFrom((generated.grpc.railwayservice2.AvailabilityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.railwayservice2.AvailabilityResponse other) {
      if (other == generated.grpc.railwayservice2.AvailabilityResponse.getDefaultInstance()) return this;
      if (other.getAvailableSeats() != 0) {
        setAvailableSeats(other.getAvailableSeats());
      }
      if (other.getOccupiedSeats() != 0) {
        setOccupiedSeats(other.getOccupiedSeats());
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
      generated.grpc.railwayservice2.AvailabilityResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.railwayservice2.AvailabilityResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int availableSeats_ ;
    /**
     * <code>int32 available_seats = 1;</code>
     */
    public int getAvailableSeats() {
      return availableSeats_;
    }
    /**
     * <code>int32 available_seats = 1;</code>
     */
    public Builder setAvailableSeats(int value) {
      
      availableSeats_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 available_seats = 1;</code>
     */
    public Builder clearAvailableSeats() {
      
      availableSeats_ = 0;
      onChanged();
      return this;
    }

    private int occupiedSeats_ ;
    /**
     * <code>int32 occupied_seats = 2;</code>
     */
    public int getOccupiedSeats() {
      return occupiedSeats_;
    }
    /**
     * <code>int32 occupied_seats = 2;</code>
     */
    public Builder setOccupiedSeats(int value) {
      
      occupiedSeats_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 occupied_seats = 2;</code>
     */
    public Builder clearOccupiedSeats() {
      
      occupiedSeats_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RailwayService2.AvailabilityResponse)
  }

  // @@protoc_insertion_point(class_scope:RailwayService2.AvailabilityResponse)
  private static final generated.grpc.railwayservice2.AvailabilityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.railwayservice2.AvailabilityResponse();
  }

  public static generated.grpc.railwayservice2.AvailabilityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvailabilityResponse>
      PARSER = new com.google.protobuf.AbstractParser<AvailabilityResponse>() {
    @java.lang.Override
    public AvailabilityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AvailabilityResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AvailabilityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvailabilityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.railwayservice2.AvailabilityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

