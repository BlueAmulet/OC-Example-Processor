package li.cil.oc.example.processor;

/** Interface defining callbacks provided by the host. */
public interface PseudoNativeFunction {
  Object invoke(Object[] args);
}
