import map.*;
import organisms.*;
import statistics.Statistics;
import api.*;

import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        dialog.dialog();
        dialog.createFieldAndStatistics();

    }
}
