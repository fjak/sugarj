package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $L$Choice_2_0 extends Strategy 
{ 
  public static $L$Choice_2_0 instance = new $L$Choice_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_15, Strategy u_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LChoice_2_0");
    Fail94:
    { 
      IStrategoTerm h_106 = null;
      IStrategoTerm f_106 = null;
      IStrategoTerm g_106 = null;
      IStrategoTerm i_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consLChoice_2 != ((IStrategoAppl)term).getConstructor())
        break Fail94;
      f_106 = term.getSubterm(0);
      g_106 = term.getSubterm(1);
      IStrategoList annos83 = term.getAnnotations();
      h_106 = annos83;
      term = t_15.invoke(context, f_106);
      if(term == null)
        break Fail94;
      i_106 = term;
      term = u_15.invoke(context, g_106);
      if(term == null)
        break Fail94;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consLChoice_2, new IStrategoTerm[]{i_106, term}), checkListAnnos(termFactory, h_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}