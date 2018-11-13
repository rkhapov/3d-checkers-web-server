package server;

import core.ICheckersServer;

public class TurnHandler extends CommandHandler {

  public TurnHandler(ICheckersServer checkersServer) {
    super(checkersServer);
  }

  @Override
  public Response handleRequest(Request request) {
    return new Response("turn", HttpStatusCode.OK);
  }
}
