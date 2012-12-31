package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sugar$Dec$Head_2_0 extends Strategy 
{ 
  public static $Sugar$Dec$Head_2_0 instance = new $Sugar$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_17, Strategy u_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SugarDecHead_2_0");
    Fail22:
    { 
      IStrategoTerm h_105 = null;
      IStrategoTerm f_105 = null;
      IStrategoTerm g_105 = null;
      IStrategoTerm i_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consSugarDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      f_105 = term.getSubterm(0);
      g_105 = term.getSubterm(1);
      IStrategoList annos4 = term.getAnnotations();
      h_105 = annos4;
      term = t_17.invoke(context, f_105);
      if(term == null)
        break Fail22;
      i_105 = term;
      term = u_17.invoke(context, g_105);
      if(term == null)
        break Fail22;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consSugarDecHead_2, new IStrategoTerm[]{i_105, term}), checkListAnnos(termFactory, h_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}