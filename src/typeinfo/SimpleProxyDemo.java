package typeinfo;

import static net.mindview.util.Print.*;

/**
 * Created by maria on 2016-03-29.
 */

interface Interface{
        void doSomething();
        void somethingElse(String arg);
        }

class RealObject implements Interface {

        @Override
        public void doSomething() {
                print("doSomething");
        }

        @Override
        public void somethingElse(String arg) {
                print("somethingElse " + arg);
        }
}

class SimpleProxy implements Interface {
        private Interface proxied;

        SimpleProxy(Interface proxied) {
                this.proxied = proxied;
        }

        @Override
        public void doSomething() {
                print("SimpleProxy doSomething");
                proxied.doSomething();
        }

        @Override
        public void somethingElse(String args) {
                print("SimpleProxy somethingElse " + args);
                proxied.somethingElse(args);
        }
}

public class SimpleProxyDemo {
        public static void consumer(Interface iface) {
                iface.doSomething();
                iface.somethingElse("bonobo");
        }
        public static void main(String[] args) {
                consumer(new RealObject());
                print();
                consumer(new SimpleProxy(new RealObject()));
        }
}
