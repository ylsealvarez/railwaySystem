package generated.grpc.railwayservice3;

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
    comments = "Source: RailwayService3.proto")
public final class RailwayService3Grpc {

  private RailwayService3Grpc() {}

  public static final String SERVICE_NAME = "RailwayService3.RailwayService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.railwayservice3.FailureRequest,
      generated.grpc.railwayservice3.FailureResponse> getFailureReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FailureReport",
      requestType = generated.grpc.railwayservice3.FailureRequest.class,
      responseType = generated.grpc.railwayservice3.FailureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.railwayservice3.FailureRequest,
      generated.grpc.railwayservice3.FailureResponse> getFailureReportMethod() {
    io.grpc.MethodDescriptor<generated.grpc.railwayservice3.FailureRequest, generated.grpc.railwayservice3.FailureResponse> getFailureReportMethod;
    if ((getFailureReportMethod = RailwayService3Grpc.getFailureReportMethod) == null) {
      synchronized (RailwayService3Grpc.class) {
        if ((getFailureReportMethod = RailwayService3Grpc.getFailureReportMethod) == null) {
          RailwayService3Grpc.getFailureReportMethod = getFailureReportMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.railwayservice3.FailureRequest, generated.grpc.railwayservice3.FailureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RailwayService3.RailwayService3", "FailureReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice3.FailureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice3.FailureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RailwayService3MethodDescriptorSupplier("FailureReport"))
                  .build();
          }
        }
     }
     return getFailureReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RailwayService3Stub newStub(io.grpc.Channel channel) {
    return new RailwayService3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RailwayService3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RailwayService3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RailwayService3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RailwayService3FutureStub(channel);
  }

  /**
   */
  public static abstract class RailwayService3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * BI-DI for each reported failure or incident, a report with an emergency call-out or maintenance schedule is generated.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.railwayservice3.FailureRequest> failureReport(
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice3.FailureResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFailureReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFailureReportMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.railwayservice3.FailureRequest,
                generated.grpc.railwayservice3.FailureResponse>(
                  this, METHODID_FAILURE_REPORT)))
          .build();
    }
  }

  /**
   */
  public static final class RailwayService3Stub extends io.grpc.stub.AbstractStub<RailwayService3Stub> {
    private RailwayService3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService3Stub(channel, callOptions);
    }

    /**
     * <pre>
     * BI-DI for each reported failure or incident, a report with an emergency call-out or maintenance schedule is generated.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.railwayservice3.FailureRequest> failureReport(
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice3.FailureResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFailureReportMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RailwayService3BlockingStub extends io.grpc.stub.AbstractStub<RailwayService3BlockingStub> {
    private RailwayService3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService3BlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RailwayService3FutureStub extends io.grpc.stub.AbstractStub<RailwayService3FutureStub> {
    private RailwayService3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService3FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FAILURE_REPORT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RailwayService3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RailwayService3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FAILURE_REPORT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.failureReport(
              (io.grpc.stub.StreamObserver<generated.grpc.railwayservice3.FailureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RailwayService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RailwayService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.railwayservice3.RailwayService3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RailwayService3");
    }
  }

  private static final class RailwayService3FileDescriptorSupplier
      extends RailwayService3BaseDescriptorSupplier {
    RailwayService3FileDescriptorSupplier() {}
  }

  private static final class RailwayService3MethodDescriptorSupplier
      extends RailwayService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RailwayService3MethodDescriptorSupplier(String methodName) {
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
      synchronized (RailwayService3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RailwayService3FileDescriptorSupplier())
              .addMethod(getFailureReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
