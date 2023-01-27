package com.example.structural.adapter.objectimpl;

import com.example.structural.adapter.SocketAdapter;
import com.example.structural.adapter.model.Socket;
import com.example.structural.adapter.model.Voltage;

public class SocketObjectAdapterImpl implements SocketAdapter {
    private final Socket socket = new Socket();

    @Override
    public Voltage get3Volts() {
        Voltage volts120 = socket.getVoltage();
        return convertVoltage(volts120, 40);
    }

    @Override
    public Voltage get12Volts() {
        Voltage volts120 = socket.getVoltage();
        return convertVoltage(volts120, 10);
    }

    @Override
    public Voltage get120Volts() {
        return socket.getVoltage();
    }

    private Voltage convertVoltage(Voltage voltage, int nrOfTimesLessThenDefault){
        return new Voltage(voltage.getVolts() / nrOfTimesLessThenDefault);
    }
}
