package infra;

import primitives.Checker;
import primitives.Status;
import primitives.Vector;

import java.util.ArrayList;

interface ICheckerServer {

    ArrayList locationCheckers = null;

//    Checker getCheckerByCords(Vector cords);

    Status makeMove(Checker checker, Vector vector);

    ArrayList getLocationCheckers();
}
