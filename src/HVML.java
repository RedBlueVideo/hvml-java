/**
 *
 */
package video.redblue.hvml;

import com.eclipsesource.v8.V8;

/**
 * @author Hugh
 *
 */
public class HVML {

  /**
   * @param args
   */
  public static void main(String[] args) {
    V8 runtime = V8.createV8Runtime();
    int result = runtime.executeIntegerScript(
    "" + "var hello = 'hello, ';\n" + "var world = 'world!';\n" + "hello.concat(world).length;\n");
    System.out.println(result);
  }

}
