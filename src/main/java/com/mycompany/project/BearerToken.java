/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import com.google.rpc.RequestInfo;
import io.grpc.Attributes;
import io.grpc.CallCredentials;
import io.grpc.CallCredentials.MetadataApplier;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.concurrent.Executor;

/**
 * This class is used to send the Token by a call
 * @author alvar
 */
public class BearerToken implements CallCredentials {
    private String value;

    public BearerToken(String value) {
        this.value = value;
    }

    @Override
    public void thisUsesUnstableApi() {
        // noop
    }

    @Override
    public void applyRequestMetadata(MethodDescriptor<?, ?> method, Attributes attrs, Executor appExecutor, MetadataApplier applier) {
        appExecutor.execute(() -> {
            try {
                Metadata headers = new Metadata();
                Metadata.Key<String> AUTHORIZATION_HEADER =
                        Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);

                headers.put(AUTHORIZATION_HEADER, "Bearer " + value);
                applier.apply(headers); // ✅ ¡Aplicar los headers correctamente!
            } catch (Exception e) {
                applier.fail(Status.UNAUTHENTICATED.withDescription("Failed to set JWT").withCause(e));
            }
        });
    }
}
