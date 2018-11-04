package server;

import com.sun.net.httpserver.HttpExchange;
import infra.ICheckersServer;
import java.io.IOException;

public class GetPlayingSessionHandler extends CommandHandler {

  public GetPlayingSessionHandler(ICheckersServer checkersServer) {
    super(checkersServer);
  }

  @Override
  public Response handleRequest(Request request) {
    return new Response("get session", HttpStatusCode.OK);
  }
}