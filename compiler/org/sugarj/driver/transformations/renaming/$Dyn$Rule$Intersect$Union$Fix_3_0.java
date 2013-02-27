package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Dyn$Rule$Intersect$Union$Fix_3_0 extends Strategy 
{ 
  public static $Dyn$Rule$Intersect$Union$Fix_3_0 instance = new $Dyn$Rule$Intersect$Union$Fix_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_13, Strategy r_13, Strategy s_13)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DynRuleIntersectUnionFix_3_0");
    Fail60:
    { 
      IStrategoTerm o_100 = null;
      IStrategoTerm l_100 = null;
      IStrategoTerm m_100 = null;
      IStrategoTerm n_100 = null;
      IStrategoTerm p_100 = null;
      IStrategoTerm q_100 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consDynRuleIntersectUnionFix_3 != ((IStrategoAppl)term).getConstructor())
        break Fail60;
      l_100 = term.getSubterm(0);
      m_100 = term.getSubterm(1);
      n_100 = term.getSubterm(2);
      IStrategoList annos50 = term.getAnnotations();
      o_100 = annos50;
      term = q_13.invoke(context, l_100);
      if(term == null)
        break Fail60;
      p_100 = term;
      term = r_13.invoke(context, m_100);
      if(term == null)
        break Fail60;
      q_100 = term;
      term = s_13.invoke(context, n_100);
      if(term == null)
        break Fail60;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consDynRuleIntersectUnionFix_3, new IStrategoTerm[]{p_100, q_100, term}), checkListAnnos(termFactory, o_100));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}