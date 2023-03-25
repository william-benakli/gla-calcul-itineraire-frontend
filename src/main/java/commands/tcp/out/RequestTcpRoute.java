package commands.tcp.out;

import commands.tcp.RequestTcp;

public class RequestTcpRoute implements RequestTcp {

    public RequestTcpRoute() {}

    @Override
    public String commandBuilder(String[] args) {
        if (args.length < 3) {
            return "undefined";
        }
        return "ROUTE;" + args[1] + ";" + args[2];
    }
    
}