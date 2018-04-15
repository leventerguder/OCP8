package mock;

interface BI {
}

interface DI extends BI {
}

class X<T extends DI> {
}

public class QX15 {

}
