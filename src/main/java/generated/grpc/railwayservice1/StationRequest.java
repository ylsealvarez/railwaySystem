// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RailwayService1.proto

package generated.grpc.railwayservice1;

/**
 * <pre>
 *  message identifying a train station
 * </pre>
 *
 * Protobuf type {@code RailwayService1.StationRequest}
 */
public  final class StationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RailwayService1.StationRequest)
    StationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StationRequest.newBuilder() to construct.
  private StationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StationRequest() {
    trainStation_ = "";
    trainID_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StationRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            trainStation_ = s;
            break;
          }
          case 16: {

            trainID_ = input.readInt32();
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
    return generated.grpc.railwayservice1.RailwayService1Impl.internal_static_RailwayService1_StationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.railwayservice1.RailwayService1Impl.internal_static_RailwayService1_StationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.railwayservice1.StationRequest.class, generated.grpc.railwayservice1.StationRequest.Builder.class);
  }

  public static final int TRAIN_STATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object trainStation_;
  /**
   * <code>string train_station = 1;</code>
   */
  public java.lang.String getTrainStation() {
    java.lang.Object ref = trainStation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trainStation_ = s;
      return s;
    }
  }
  /**
   * <code>string train_station = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTrainStationBytes() {
    java.lang.Object ref = trainStation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trainStation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRAIN_ID_FIELD_NUMBER = 2;
  private int trainID_;
  /**
   * <code>int32 train_iD = 2;</code>
   */
  public int getTrainID() {
    return trainID_;
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
    if (!getTrainStationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trainStation_);
    }
    if (trainID_ != 0) {
      output.writeInt32(2, trainID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTrainStationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trainStation_);
    }
    if (trainID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, trainID_);
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
    if (!(obj instanceof generated.grpc.railwayservice1.StationRequest)) {
      return super.equals(obj);
    }
    generated.grpc.railwayservice1.StationRequest other = (generated.grpc.railwayservice1.StationRequest) obj;

    boolean result = true;
    result = result && getTrainStation()
        .equals(other.getTrainStation());
    result = result && (getTrainID()
        == other.getTrainID());
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
    hash = (37 * hash) + TRAIN_STATION_FIELD_NUMBER;
    hash = (53 * hash) + getTrainStation().hashCode();
    hash = (37 * hash) + TRAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTrainID();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.railwayservice1.StationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice1.StationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.railwayservice1.StationRequest parseFrom(
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
  public static Builder newBuilder(generated.grpc.railwayservice1.StationRequest prototype) {
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
   *  message identifying a train station
   * </pre>
   *
   * Protobuf type {@code RailwayService1.StationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RailwayService1.StationRequest)
      generated.grpc.railwayservice1.StationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.railwayservice1.RailwayService1Impl.internal_static_RailwayService1_StationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.railwayservice1.RailwayService1Impl.internal_static_RailwayService1_StationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.railwayservice1.StationRequest.class, generated.grpc.railwayservice1.StationRequest.Builder.class);
    }

    // Construct using generated.grpc.railwayservice1.StationRequest.newBuilder()
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
      trainStation_ = "";

      trainID_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.railwayservice1.RailwayService1Impl.internal_static_RailwayService1_StationRequest_descriptor;
    }

    @java.lang.Override
    public generated.grpc.railwayservice1.StationRequest getDefaultInstanceForType() {
      return generated.grpc.railwayservice1.StationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.railwayservice1.StationRequest build() {
      generated.grpc.railwayservice1.StationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.railwayservice1.StationRequest buildPartial() {
      generated.grpc.railwayservice1.StationRequest result = new generated.grpc.railwayservice1.StationRequest(this);
      result.trainStation_ = trainStation_;
      result.trainID_ = trainID_;
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
      if (other instanceof generated.grpc.railwayservice1.StationRequest) {
        return mergeFrom((generated.grpc.railwayservice1.StationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.railwayservice1.StationRequest other) {
      if (other == generated.grpc.railwayservice1.StationRequest.getDefaultInstance()) return this;
      if (!other.getTrainStation().isEmpty()) {
        trainStation_ = other.trainStation_;
        onChanged();
      }
      if (other.getTrainID() != 0) {
        setTrainID(other.getTrainID());
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
      generated.grpc.railwayservice1.StationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.railwayservice1.StationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object trainStation_ = "";
    /**
     * <code>string train_station = 1;</code>
     */
    public java.lang.String getTrainStation() {
      java.lang.Object ref = trainStation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trainStation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string train_station = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTrainStationBytes() {
      java.lang.Object ref = trainStation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trainStation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string train_station = 1;</code>
     */
    public Builder setTrainStation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      trainStation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string train_station = 1;</code>
     */
    public Builder clearTrainStation() {
      
      trainStation_ = getDefaultInstance().getTrainStation();
      onChanged();
      return this;
    }
    /**
     * <code>string train_station = 1;</code>
     */
    public Builder setTrainStationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      trainStation_ = value;
      onChanged();
      return this;
    }

    private int trainID_ ;
    /**
     * <code>int32 train_iD = 2;</code>
     */
    public int getTrainID() {
      return trainID_;
    }
    /**
     * <code>int32 train_iD = 2;</code>
     */
    public Builder setTrainID(int value) {
      
      trainID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 train_iD = 2;</code>
     */
    public Builder clearTrainID() {
      
      trainID_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RailwayService1.StationRequest)
  }

  // @@protoc_insertion_point(class_scope:RailwayService1.StationRequest)
  private static final generated.grpc.railwayservice1.StationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.railwayservice1.StationRequest();
  }

  public static generated.grpc.railwayservice1.StationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StationRequest>
      PARSER = new com.google.protobuf.AbstractParser<StationRequest>() {
    @java.lang.Override
    public StationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.railwayservice1.StationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

