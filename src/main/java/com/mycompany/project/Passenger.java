package com.mycompany.project;

import generated.grpc.railwayservice2.AvailabilityResponse;
import generated.grpc.railwayservice2.SeatBookingResponse;
import generated.grpc.railwayservice2.BookingRequest;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author alvar
 */
public class Passenger extends javax.swing.JInternalFrame {

    Client2 Client2;
    StreamObserver<BookingRequest> requestObserver;
    /**
     * Creates new form Passenger
     */
    public Passenger() {
        initComponents();
        Client2 = new Client2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PassengerLabel = new javax.swing.JLabel();
        PassengerIDLabel = new javax.swing.JLabel();
        PassengerIDTextField = new javax.swing.JTextField();
        BookingIDLabel = new javax.swing.JLabel();
        BookingIDTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResponsePassenger = new javax.swing.JTextArea();
        PassengerIDLabel2 = new javax.swing.JLabel();
        PassengerID2TextField = new javax.swing.JTextField();
        OriginLabel = new javax.swing.JLabel();
        DestinationLabel = new javax.swing.JLabel();
        BookSeatButton = new javax.swing.JToggleButton();
        OriginComboBox = new javax.swing.JComboBox<>();
        DestinationComboBox = new javax.swing.JComboBox<>();
        PrepareButton = new javax.swing.JButton();
        SendBookingButton = new javax.swing.JButton();
        FinishButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        PassengerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassengerLabel.setText("Passenger Information System");

        PassengerIDLabel.setText("PassengerID");

        BookingIDLabel.setText("BookingID");

        ResponsePassenger.setColumns(20);
        ResponsePassenger.setRows(5);
        jScrollPane1.setViewportView(ResponsePassenger);

        PassengerIDLabel2.setText("PassengerID");

        OriginLabel.setText("Origin");

        DestinationLabel.setText("Destination");

        BookSeatButton.setText("Book Seat");
        BookSeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookSeatButtonActionPerformed(evt);
            }
        });

        OriginComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Connolly Station", "Heuston Station" }));
        OriginComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginComboBoxActionPerformed(evt);
            }
        });

        PrepareButton.setText("Prepare Client Streaming");
        PrepareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrepareButtonActionPerformed(evt);
            }
        });

        SendBookingButton.setText("Send Booking");
        SendBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendBookingButtonActionPerformed(evt);
            }
        });

        FinishButton.setText("Finish Check-in");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel Booking");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassengerIDLabel)
                            .addComponent(BookingIDLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(SendBookingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BookSeatButton)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DestinationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrepareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(BookingIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(PassengerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PassengerIDLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(OriginLabel)
                                        .addGap(11, 11, 11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(PassengerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PassengerID2TextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OriginComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DestinationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 4, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PassengerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassengerIDLabel2)
                    .addComponent(PassengerID2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrepareButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OriginLabel)
                            .addComponent(OriginComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DestinationLabel)
                            .addComponent(DestinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassengerIDLabel)
                            .addComponent(PassengerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookingIDLabel)
                            .addComponent(BookingIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BookSeatButton)
                            .addComponent(SendBookingButton)
                            .addComponent(CancelButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FinishButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OriginComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriginComboBoxActionPerformed
        String origin = OriginComboBox.getSelectedItem().toString();
    
        DestinationComboBox.removeAllItems();
        
        if("Connolly Station".equals(origin)){
            DestinationComboBox.addItem("Bray Station");
            DestinationComboBox.addItem("Greystones Station");
            DestinationComboBox.addItem("Arklow Station");
            DestinationComboBox.addItem("Rosslare Station");
        }else if("Heuston Station".equals(origin)){
            DestinationComboBox.addItem("Tullamore Station");
            DestinationComboBox.addItem("Athlone Station");
            DestinationComboBox.addItem("Athenry Station");
            DestinationComboBox.addItem("Galway Station");
        }
    }//GEN-LAST:event_OriginComboBoxActionPerformed

    private void BookSeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookSeatButtonActionPerformed
        int value1 = Integer.parseInt(PassengerID2TextField.getText().trim());
        String value2 = OriginComboBox.getSelectedItem().toString();
        String value3 = DestinationComboBox.getSelectedItem().toString();
        
        SeatBookingResponse response = Client2.getSeatBooking(value1, value2, value3);
        ResponsePassenger.setText("PassengerID: " + value1 + ", Origin: " + value2 + ", Destination: " + value3 + "\n"
                                    + "Please note your BookingID: " + response.getBookingID() + ", Status: " + response.getConfirmation());
        
        /*System.out.println("" + book.getPassengerID() + "" + book.getOrigen() + "" + book.getDestination());
           System.out.println("" + response.getBookingID() + "" + response.getConfirmation() + "\n");
*/
        
    }//GEN-LAST:event_BookSeatButtonActionPerformed

    private void PrepareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrepareButtonActionPerformed
        
        StreamObserver<AvailabilityResponse> responseObserver = new StreamObserver<AvailabilityResponse>(){

            @Override
            public void onNext(AvailabilityResponse response){
                System.out.print("Response from server is ready\n ");
                ResponsePassenger.setText(LocalTime.now().toString() + " Check-in completed. \n Available Seats: " 
                        + response.getAvailableSeats() + ", Occupied Seats " + response.getOccupiedSeats());
            }

            @Override
            public void onError(Throwable t) {
                SwingUtilities.invokeLater(() -> {
                    ResponsePassenger.setText("Booking cancelled");
                });
            }

            @Override
            public void onCompleted() {
                System.out.println(LocalTime.now().toString() + ": stream is completed.\n");
            }
        };
        requestObserver = Client2.getPassengersBooking(responseObserver);
        ResponsePassenger.setText("Ready. Please enter the data.");
    }//GEN-LAST:event_PrepareButtonActionPerformed

    private void SendBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendBookingButtonActionPerformed
        
        try{
            int value1 = Integer.parseInt(PassengerIDTextField.getText().trim());
            int value2 = Integer.parseInt(BookingIDTextField.getText().trim());
            requestObserver.onNext(BookingRequest.newBuilder().setPassengerID(value1).setBookingID(value2).build());
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_SendBookingButtonActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        requestObserver.onCompleted();
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        Client2.cancelBooking(); // stop the stream
    }//GEN-LAST:event_CancelButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BookSeatButton;
    private javax.swing.JLabel BookingIDLabel;
    private javax.swing.JTextField BookingIDTextField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> DestinationComboBox;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JButton FinishButton;
    private javax.swing.JComboBox<String> OriginComboBox;
    private javax.swing.JLabel OriginLabel;
    private javax.swing.JTextField PassengerID2TextField;
    private javax.swing.JLabel PassengerIDLabel;
    private javax.swing.JLabel PassengerIDLabel2;
    private javax.swing.JTextField PassengerIDTextField;
    private javax.swing.JLabel PassengerLabel;
    private javax.swing.JButton PrepareButton;
    private javax.swing.JTextArea ResponsePassenger;
    private javax.swing.JButton SendBookingButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
