package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class_1_0 extends Strategy 
{ 
  public static $Class_1_0 instance = new $Class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Class_1_0");
    Fail151:
    { 
      IStrategoTerm l_131 = null;
      IStrategoTerm j_131 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      j_131 = term.getSubterm(0);
      IStrategoList annos126 = term.getAnnotations();
      l_131 = annos126;
      term = x_26.invoke(context, j_131);
      if(term == null)
        break Fail151;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_131));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}