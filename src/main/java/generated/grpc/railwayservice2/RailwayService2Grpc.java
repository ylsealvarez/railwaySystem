package generated.grpc.railwayservice2;

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
    comments = "Source: RailwayService2.proto")
public final class RailwayService2Grpc {

  private RailwayService2Grpc() {}

  public static final String SERVICE_NAME = "RailwayService2.RailwayService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.railwayservice2.BookingRequest,
      generated.grpc.railwayservice2.AvailabilityResponse> getPassengersBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PassengersBooking",
      requestType = generated.grpc.railwayservice2.BookingRequest.class,
      responseType = generated.grpc.railwayservice2.AvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.railwayservice2.BookingRequest,
      generated.grpc.railwayservice2.AvailabilityResponse> getPassengersBookingMethod() {
    io.grpc.MethodDescriptor<generated.grpc.railwayservice2.BookingRequest, generated.grpc.railwayservice2.AvailabilityResponse> getPassengersBookingMethod;
    if ((getPassengersBookingMethod = RailwayService2Grpc.getPassengersBookingMethod) == null) {
      synchronized (RailwayService2Grpc.class) {
        if ((getPassengersBookingMethod = RailwayService2Grpc.getPassengersBookingMethod) == null) {
          RailwayService2Grpc.getPassengersBookingMethod = getPassengersBookingMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.railwayservice2.BookingRequest, generated.grpc.railwayservice2.AvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RailwayService2.RailwayService2", "PassengersBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice2.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice2.AvailabilityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RailwayService2MethodDescriptorSupplier("PassengersBooking"))
                  .build();
          }
        }
     }
     return getPassengersBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.railwayservice2.SeatBookingRequest,
      generated.grpc.railwayservice2.SeatBookingResponse> getSeatBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeatBooking",
      requestType = generated.grpc.railwayservice2.SeatBookingRequest.class,
      responseType = generated.grpc.railwayservice2.SeatBookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.railwayservice2.SeatBookingRequest,
      generated.grpc.railwayservice2.SeatBookingResponse> getSeatBookingMethod() {
    io.grpc.MethodDescriptor<generated.grpc.railwayservice2.SeatBookingRequest, generated.grpc.railwayservice2.SeatBookingResponse> getSeatBookingMethod;
    if ((getSeatBookingMethod = RailwayService2Grpc.getSeatBookingMethod) == null) {
      synchronized (RailwayService2Grpc.class) {
        if ((getSeatBookingMethod = RailwayService2Grpc.getSeatBookingMethod) == null) {
          RailwayService2Grpc.getSeatBookingMethod = getSeatBookingMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.railwayservice2.SeatBookingRequest, generated.grpc.railwayservice2.SeatBookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RailwayService2.RailwayService2", "SeatBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice2.SeatBookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.railwayservice2.SeatBookingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RailwayService2MethodDescriptorSupplier("SeatBooking"))
                  .build();
          }
        }
     }
     return getSeatBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RailwayService2Stub newStub(io.grpc.Channel channel) {
    return new RailwayService2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RailwayService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RailwayService2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RailwayService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RailwayService2FutureStub(channel);
  }

  /**
   */
  public static abstract class RailwayService2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ClientStreaming- the availability on trains is obtained after the control of each passenger
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.BookingRequest> passengersBooking(
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.AvailabilityResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPassengersBookingMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unary- for each seat booking is sent a message with info about confirmation and bookingID
     * </pre>
     */
    public void seatBooking(generated.grpc.railwayservice2.SeatBookingRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.SeatBookingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSeatBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPassengersBookingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.grpc.railwayservice2.BookingRequest,
                generated.grpc.railwayservice2.AvailabilityResponse>(
                  this, METHODID_PASSENGERS_BOOKING)))
          .addMethod(
            getSeatBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.railwayservice2.SeatBookingRequest,
                generated.grpc.railwayservice2.SeatBookingResponse>(
                  this, METHODID_SEAT_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class RailwayService2Stub extends io.grpc.stub.AbstractStub<RailwayService2Stub> {
    private RailwayService2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * ClientStreaming- the availability on trains is obtained after the control of each passenger
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.BookingRequest> passengersBooking(
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.AvailabilityResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPassengersBookingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Unary- for each seat booking is sent a message with info about confirmation and bookingID
     * </pre>
     */
    public void seatBooking(generated.grpc.railwayservice2.SeatBookingRequest request,
        io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.SeatBookingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSeatBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RailwayService2BlockingStub extends io.grpc.stub.AbstractStub<RailwayService2BlockingStub> {
    private RailwayService2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary- for each seat booking is sent a message with info about confirmation and bookingID
     * </pre>
     */
    public generated.grpc.railwayservice2.SeatBookingResponse seatBooking(generated.grpc.railwayservice2.SeatBookingRequest request) {
      return blockingUnaryCall(
          getChannel(), getSeatBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RailwayService2FutureStub extends io.grpc.stub.AbstractStub<RailwayService2FutureStub> {
    private RailwayService2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RailwayService2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RailwayService2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RailwayService2FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary- for each seat booking is sent a message with info about confirmation and bookingID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.railwayservice2.SeatBookingResponse> seatBooking(
        generated.grpc.railwayservice2.SeatBookingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSeatBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEAT_BOOKING = 0;
  private static final int METHODID_PASSENGERS_BOOKING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RailwayService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RailwayService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEAT_BOOKING:
          serviceImpl.seatBooking((generated.grpc.railwayservice2.SeatBookingRequest) request,
              (io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.SeatBookingResponse>) responseObserver);
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
        case METHODID_PASSENGERS_BOOKING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.passengersBooking(
              (io.grpc.stub.StreamObserver<generated.grpc.railwayservice2.AvailabilityResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RailwayService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RailwayService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.railwayservice2.RailwayService2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RailwayService2");
    }
  }

  private static final class RailwayService2FileDescriptorSupplier
      extends RailwayService2BaseDescriptorSupplier {
    RailwayService2FileDescriptorSupplier() {}
  }

  private static final class RailwayService2MethodDescriptorSupplier
      extends RailwayService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RailwayService2MethodDescriptorSupplier(String methodName) {
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
      synchronized (RailwayService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RailwayService2FileDescriptorSupplier())
              .addMethod(getPassengersBookingMethod())
              .addMethod(getSeatBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
