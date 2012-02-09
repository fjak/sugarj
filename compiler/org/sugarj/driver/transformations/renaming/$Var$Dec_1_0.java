package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Var$Dec_1_0 extends Strategy 
{ 
  public static $Var$Dec_1_0 instance = new $Var$Dec_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("VarDec_1_0");
    Fail96:
    { 
      IStrategoTerm u_116 = null;
      IStrategoTerm t_116 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail96;
      t_116 = term.getSubterm(0);
      IStrategoList annos82 = term.getAnnotations();
      u_116 = annos82;
      term = s_20.invoke(context, t_116);
      if(term == null)
        break Fail96;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consVarDec_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_116));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}