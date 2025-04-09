package generated.grpc.railwayservice1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: RailwayService1.proto")
public final class RailwayService1Grpc {

  private RailwayService1Grpc() {}

  public static final String SERVICE_NAME = "RailwayService1.RailwayService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.railwayservice1.StationRequest,
      generated.grpc.railwayservice1.PositionResponse> getMonitorPositioningMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorPositioning",
      requestType = generated.grpc.railwayservice1.StationRequest.class,
      responseType = generated.grpc.railwayservice1.PositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.railwayservice1.StationRequest,
      generated.grpc.railwayservice1.PositionResponse> getMonitorPositioningMethod() {
    io.grpc.MethodDescriptor<generated.grpc.railwayservice1.StationRequest, generated.grpc.railwayservice1.PositionResponse> getMonitorPositioningMethod;
    if ((getMonitorPositioningMethod = RailwayService1Grpc.getMonitorPositioningMethod) == null) {
      synchronized (RailwayService1Grpc.class) {
        if ((getMonitorPositioningMethod = RailwayService1Grpc.getMonitorPositioningMethod) == null) {
          RailwayService1Grpc.getMonitorPositioningMethod = getMonitorPositioningMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.railwayservice1.StationRequest, generated.grpc.railwayservice1.PositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RailwayService1.RailwayService1", "MonitorPositioning"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice1.StationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice1.PositionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RailwayService1MethodDescriptorSupplier("MonitorPositioning"))
                  .build();
          }
        }
     }
     return getMonitorPositioningMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.railwayservice1.StationRequest,
      generated.grpc.railwayservice1.StatusResponse> getTrainStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainStatus",
      requestType = generated.grpc.railwayservice1.StationRequest.class,
      responseType = generated.grpc.railwayservice1.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.railwayservice1.StationRequest,
      generated.grpc.railwayservice1.StatusResponse> getTrainStatusMethod() {
    io.grpc.MethodDescriptor<generated.grpc.railwayservice1.StationRequest, generated.grpc.railwayservice1.StatusResponse> getTrainStatusMethod;
    if ((getTrainStatusMethod = RailwayService1Grpc.getTrainStatusMethod) == null) {
      synchronized (RailwayService1Grpc.class) {
        if ((getTrainStatusMethod = RailwayService1Grpc.getTrainStatusMethod) == null) {
          RailwayService1Grpc.getTrainStatusMethod = getTrainStatusMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.railwayservice1.StationRequest, generated.grpc.railwayservice1.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RailwayService1.RailwayService1", "TrainStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice1.StationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice1.StatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RailwayService1MethodDescriptorSupplier("TrainStatus"))
                  .build();
          }
        }
     }
     return getTrainStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RailwayService1Stub newStub(io.grpc.Channel channel) {
    return new RailwayService1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RailwayService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RailwayService1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RailwayService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RailwayService1FutureStub(channel);
  }

  /**
   */
  public static abstract class RailwayService1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ServerStreaming for a specific train get a stream of updates on the current positioning in GPS coordinates
     * </pre>
     */
    public void monitorPositioning(generated.grpc.railwayservice1.StationRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice1.PositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMonitorPositioningMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unary for a specific train get the status in that location right now
     * </pre>
     */
    public void trainStatus(generated.grpc.railwayservice1.StationRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice1.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTrainStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorPositioningMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.railwayservice1.StationRequest,
                generated.grpc.railwayservice1.PositionResponse>(
                  this, METHODID_MONITOR_POSITIONING)))
          .addMethod(
            getTrainStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.railwayservice1.StationRequest,
                generated.grpc.railwayservice1.StatusResponse>(
                  this, METHODID_TRAIN_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class RailwayService1Stub extends io.grpc.stub.AbstractStub<RailwayService1Stub> {
    private RailwayService1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * ServerStreaming for a specific train get a stream of updates on the current positioning in GPS coordinates
     * </pre>
     */
    public void monitorPositioning(generated.grpc.railwayservice1.StationRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice1.PositionResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMonitorPositioningMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unary for a specific train get the status in that location right now
     * </pre>
     */
    public void trainStatus(generated.grpc.railwayservice1.StationRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice1.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTrainStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RailwayService1BlockingStub extends io.grpc.stub.AbstractStub<RailwayService1BlockingStub> {
    private RailwayService1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ServerStreaming for a specific train get a stream of updates on the current positioning in GPS coordinates
     * </pre>
     */
    public java.util.Iterator<generated.grpc.railwayservice1.PositionResponse> monitorPositioning(
        generated.grpc.railwayservice1.StationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getMonitorPositioningMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Unary for a specific train get the status in that location right now
     * </pre>
     */
    public generated.grpc.railwayservice1.StatusResponse trainStatus(generated.grpc.railwayservice1.StationRequest request) {
      return blockingUnaryCall(
          getChannel(), getTrainStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RailwayService1FutureStub extends io.grpc.stub.AbstractStub<RailwayService1FutureStub> {
    private RailwayService1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary for a specific train get the status in that location right now
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.railwayservice1.StatusResponse> trainStatus(
        generated.grpc.railwayservice1.StationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTrainStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MONITOR_POSITIONING = 0;
  private static final int METHODID_TRAIN_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RailwayService1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RailwayService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_POSITIONING:
          serviceImpl.monitorPositioning((generated.grpc.railwayservice1.StationRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.railwayservice1.PositionResponse>) responseObserver);
          break;
        case METHODID_TRAIN_STATUS:
          serviceImpl.trainStatus((generated.grpc.railwayservice1.StationRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.railwayservice1.StatusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RailwayService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RailwayService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.railwayservice1.RailwayService1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RailwayService1");
    }
  }

  private static final class RailwayService1FileDescriptorSupplier
      extends RailwayService1BaseDescriptorSupplier {
    RailwayService1FileDescriptorSupplier() {}
  }

  private static final class RailwayService1MethodDescriptorSupplier
      extends RailwayService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RailwayService1MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RailwayService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RailwayService1FileDescriptorSupplier())
              .addMethod(getMonitorPositioningMethod())
              .addMethod(getTrainStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
