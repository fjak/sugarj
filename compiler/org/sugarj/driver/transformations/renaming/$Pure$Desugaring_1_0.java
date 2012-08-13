package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Pure$Desugaring_1_0 extends Strategy 
{ 
  public static $Pure$Desugaring_1_0 instance = new $Pure$Desugaring_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PureDesugaring_1_0");
    Fail27:
    { 
      IStrategoTerm l_106 = null;
      IStrategoTerm k_106 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consPureDesugaring_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      k_106 = term.getSubterm(0);
      IStrategoList annos9 = term.getAnnotations();
      l_106 = annos9;
      term = f_18.invoke(context, k_106);
      if(term == null)
        break Fail27;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consPureDesugaring_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_106));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}