import org.codehaus.groovy.runtime.InvokerHelper

/**
 * @project com.groovy* @author Damian Wójtowicz
 * @date 22.02.20
 */

class Main extends Script {


    @Override
    Object run() {

    }

    static void main(String[] args) {
        InvokerHelper.runScript(Main, args)

    }
}


