package com.ms.qaTools.saturn.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ms.qaTools.saturn.services.KronusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKronusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CAPITALIZED_ID", "RULE_KRONUS_ASSIGN", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_TRIPPLE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_OTHER_ID", "'.'", "'_'", "'{'", "','", "'}'", "'=>'", "'as'", "'def'", "'false'", "'generate'", "'import'", "'include'", "'kronus'", "'package'", "'return'", "'true'", "'type'", "'val'", "'with'", "'+'", "'-'", "'<:'", "'['", "']'", "'$'", "'('", "')'", "':'", "'@'", "'#'", "'*'", "'!'", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'%'", "'&'", "';'", "'?'", "'\\\\'", "'^'", "'`'", "'|'", "'~'", "'<-'"
    };
    public static final int T__50=50;
    public static final int RULE_KRONUS_ASSIGN=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int RULE_TRIPPLE_STRING=9;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_CAPITALIZED_ID=4;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_OTHER_ID=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKronusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKronusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKronusParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g"; }



     	private KronusGrammarAccess grammarAccess;
     	
        public InternalKronusParser(TokenStream input, KronusGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TopLevelKronus";	
       	}
       	
       	@Override
       	protected KronusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTopLevelKronus"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:67:1: entryRuleTopLevelKronus returns [EObject current=null] : iv_ruleTopLevelKronus= ruleTopLevelKronus EOF ;
    public final EObject entryRuleTopLevelKronus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelKronus = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:68:2: (iv_ruleTopLevelKronus= ruleTopLevelKronus EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:69:2: iv_ruleTopLevelKronus= ruleTopLevelKronus EOF
            {
             newCompositeNode(grammarAccess.getTopLevelKronusRule()); 
            pushFollow(FOLLOW_ruleTopLevelKronus_in_entryRuleTopLevelKronus75);
            iv_ruleTopLevelKronus=ruleTopLevelKronus();

            state._fsp--;

             current =iv_ruleTopLevelKronus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelKronus85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelKronus"


    // $ANTLR start "ruleTopLevelKronus"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:76:1: ruleTopLevelKronus returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDef ) ) ( (lv_kronus_1_0= ruleKronus ) ) ) ;
    public final EObject ruleTopLevelKronus() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_kronus_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:79:28: ( ( ( (lv_package_0_0= rulePackageDef ) ) ( (lv_kronus_1_0= ruleKronus ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:80:1: ( ( (lv_package_0_0= rulePackageDef ) ) ( (lv_kronus_1_0= ruleKronus ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:80:1: ( ( (lv_package_0_0= rulePackageDef ) ) ( (lv_kronus_1_0= ruleKronus ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:80:2: ( (lv_package_0_0= rulePackageDef ) ) ( (lv_kronus_1_0= ruleKronus ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:80:2: ( (lv_package_0_0= rulePackageDef ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:81:1: (lv_package_0_0= rulePackageDef )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:81:1: (lv_package_0_0= rulePackageDef )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:82:3: lv_package_0_0= rulePackageDef
            {
             
            	        newCompositeNode(grammarAccess.getTopLevelKronusAccess().getPackagePackageDefParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePackageDef_in_ruleTopLevelKronus131);
            lv_package_0_0=rulePackageDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTopLevelKronusRule());
            	        }
                   		set(
                   			current, 
                   			"package",
                    		lv_package_0_0, 
                    		"PackageDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:98:2: ( (lv_kronus_1_0= ruleKronus ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:99:1: (lv_kronus_1_0= ruleKronus )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:99:1: (lv_kronus_1_0= ruleKronus )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:100:3: lv_kronus_1_0= ruleKronus
            {
             
            	        newCompositeNode(grammarAccess.getTopLevelKronusAccess().getKronusKronusParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKronus_in_ruleTopLevelKronus152);
            lv_kronus_1_0=ruleKronus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTopLevelKronusRule());
            	        }
                   		set(
                   			current, 
                   			"kronus",
                    		lv_kronus_1_0, 
                    		"Kronus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelKronus"


    // $ANTLR start "entryRuleKronus"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:124:1: entryRuleKronus returns [EObject current=null] : iv_ruleKronus= ruleKronus EOF ;
    public final EObject entryRuleKronus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKronus = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:125:2: (iv_ruleKronus= ruleKronus EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:126:2: iv_ruleKronus= ruleKronus EOF
            {
             newCompositeNode(grammarAccess.getKronusRule()); 
            pushFollow(FOLLOW_ruleKronus_in_entryRuleKronus188);
            iv_ruleKronus=ruleKronus();

            state._fsp--;

             current =iv_ruleKronus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKronus198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKronus"


    // $ANTLR start "ruleKronus"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:133:1: ruleKronus returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImportDef ) )* ( (lv_includes_2_0= ruleIncludeDef ) )* ( (lv_defs_3_0= ruleAbstractDef ) )* ( ruleRETURN ( (lv_return_5_0= ruleValueOperation ) ) )? ) ;
    public final EObject ruleKronus() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_includes_2_0 = null;

        EObject lv_defs_3_0 = null;

        EObject lv_return_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:136:28: ( ( () ( (lv_imports_1_0= ruleImportDef ) )* ( (lv_includes_2_0= ruleIncludeDef ) )* ( (lv_defs_3_0= ruleAbstractDef ) )* ( ruleRETURN ( (lv_return_5_0= ruleValueOperation ) ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:137:1: ( () ( (lv_imports_1_0= ruleImportDef ) )* ( (lv_includes_2_0= ruleIncludeDef ) )* ( (lv_defs_3_0= ruleAbstractDef ) )* ( ruleRETURN ( (lv_return_5_0= ruleValueOperation ) ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:137:1: ( () ( (lv_imports_1_0= ruleImportDef ) )* ( (lv_includes_2_0= ruleIncludeDef ) )* ( (lv_defs_3_0= ruleAbstractDef ) )* ( ruleRETURN ( (lv_return_5_0= ruleValueOperation ) ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:137:2: () ( (lv_imports_1_0= ruleImportDef ) )* ( (lv_includes_2_0= ruleIncludeDef ) )* ( (lv_defs_3_0= ruleAbstractDef ) )* ( ruleRETURN ( (lv_return_5_0= ruleValueOperation ) ) )?
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:137:2: ()
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:138:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKronusAccess().getKronusAction_0(),
                        current);
                

            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:143:2: ( (lv_imports_1_0= ruleImportDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:144:1: (lv_imports_1_0= ruleImportDef )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:144:1: (lv_imports_1_0= ruleImportDef )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:145:3: lv_imports_1_0= ruleImportDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKronusAccess().getImportsImportDefParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportDef_in_ruleKronus253);
            	    lv_imports_1_0=ruleImportDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKronusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"ImportDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:161:3: ( (lv_includes_2_0= ruleIncludeDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:162:1: (lv_includes_2_0= ruleIncludeDef )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:162:1: (lv_includes_2_0= ruleIncludeDef )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:163:3: lv_includes_2_0= ruleIncludeDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKronusAccess().getIncludesIncludeDefParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncludeDef_in_ruleKronus275);
            	    lv_includes_2_0=ruleIncludeDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKronusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_2_0, 
            	            		"IncludeDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:179:3: ( (lv_defs_3_0= ruleAbstractDef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20||(LA3_0>=29 && LA3_0<=30)||(LA3_0>=41 && LA3_0<=42)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:180:1: (lv_defs_3_0= ruleAbstractDef )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:180:1: (lv_defs_3_0= ruleAbstractDef )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:181:3: lv_defs_3_0= ruleAbstractDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKronusAccess().getDefsAbstractDefParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractDef_in_ruleKronus297);
            	    lv_defs_3_0=ruleAbstractDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKronusRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"defs",
            	            		lv_defs_3_0, 
            	            		"AbstractDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:197:3: ( ruleRETURN ( (lv_return_5_0= ruleValueOperation ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:198:5: ruleRETURN ( (lv_return_5_0= ruleValueOperation ) )
                    {
                     
                            newCompositeNode(grammarAccess.getKronusAccess().getRETURNParserRuleCall_4_0()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_in_ruleKronus315);
                    ruleRETURN();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:205:1: ( (lv_return_5_0= ruleValueOperation ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:206:1: (lv_return_5_0= ruleValueOperation )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:206:1: (lv_return_5_0= ruleValueOperation )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:207:3: lv_return_5_0= ruleValueOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getKronusAccess().getReturnValueOperationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueOperation_in_ruleKronus335);
                    lv_return_5_0=ruleValueOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKronusRule());
                    	        }
                           		set(
                           			current, 
                           			"return",
                            		lv_return_5_0, 
                            		"ValueOperation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKronus"


    // $ANTLR start "entryRuleAbstractDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:231:1: entryRuleAbstractDef returns [EObject current=null] : iv_ruleAbstractDef= ruleAbstractDef EOF ;
    public final EObject entryRuleAbstractDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:232:2: (iv_ruleAbstractDef= ruleAbstractDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:233:2: iv_ruleAbstractDef= ruleAbstractDef EOF
            {
             newCompositeNode(grammarAccess.getAbstractDefRule()); 
            pushFollow(FOLLOW_ruleAbstractDef_in_entryRuleAbstractDef373);
            iv_ruleAbstractDef=ruleAbstractDef();

            state._fsp--;

             current =iv_ruleAbstractDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDef383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDef"


    // $ANTLR start "ruleAbstractDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:240:1: ruleAbstractDef returns [EObject current=null] : (this_TypeDef_0= ruleTypeDef | this_AnnotationDef_1= ruleAnnotationDef | this_HashtagDef_2= ruleHashtagDef | this_FunctionDef_3= ruleFunctionDef | this_ValDef_4= ruleValDef ) ;
    public final EObject ruleAbstractDef() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDef_0 = null;

        EObject this_AnnotationDef_1 = null;

        EObject this_HashtagDef_2 = null;

        EObject this_FunctionDef_3 = null;

        EObject this_ValDef_4 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:243:28: ( (this_TypeDef_0= ruleTypeDef | this_AnnotationDef_1= ruleAnnotationDef | this_HashtagDef_2= ruleHashtagDef | this_FunctionDef_3= ruleFunctionDef | this_ValDef_4= ruleValDef ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:244:1: (this_TypeDef_0= ruleTypeDef | this_AnnotationDef_1= ruleAnnotationDef | this_HashtagDef_2= ruleHashtagDef | this_FunctionDef_3= ruleFunctionDef | this_ValDef_4= ruleValDef )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:244:1: (this_TypeDef_0= ruleTypeDef | this_AnnotationDef_1= ruleAnnotationDef | this_HashtagDef_2= ruleHashtagDef | this_FunctionDef_3= ruleFunctionDef | this_ValDef_4= ruleValDef )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:245:5: this_TypeDef_0= ruleTypeDef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefAccess().getTypeDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleAbstractDef430);
                    this_TypeDef_0=ruleTypeDef();

                    state._fsp--;

                     
                            current = this_TypeDef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:255:5: this_AnnotationDef_1= ruleAnnotationDef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefAccess().getAnnotationDefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAnnotationDef_in_ruleAbstractDef457);
                    this_AnnotationDef_1=ruleAnnotationDef();

                    state._fsp--;

                     
                            current = this_AnnotationDef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:265:5: this_HashtagDef_2= ruleHashtagDef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefAccess().getHashtagDefParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHashtagDef_in_ruleAbstractDef484);
                    this_HashtagDef_2=ruleHashtagDef();

                    state._fsp--;

                     
                            current = this_HashtagDef_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:275:5: this_FunctionDef_3= ruleFunctionDef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefAccess().getFunctionDefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDef_in_ruleAbstractDef511);
                    this_FunctionDef_3=ruleFunctionDef();

                    state._fsp--;

                     
                            current = this_FunctionDef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:285:5: this_ValDef_4= ruleValDef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefAccess().getValDefParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleValDef_in_ruleAbstractDef538);
                    this_ValDef_4=ruleValDef();

                    state._fsp--;

                     
                            current = this_ValDef_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDef"


    // $ANTLR start "entryRuleValDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:303:1: entryRuleValDef returns [EObject current=null] : iv_ruleValDef= ruleValDef EOF ;
    public final EObject entryRuleValDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:304:2: (iv_ruleValDef= ruleValDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:305:2: iv_ruleValDef= ruleValDef EOF
            {
             newCompositeNode(grammarAccess.getValDefRule()); 
            pushFollow(FOLLOW_ruleValDef_in_entryRuleValDef575);
            iv_ruleValDef=ruleValDef();

            state._fsp--;

             current =iv_ruleValDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValDef585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValDef"


    // $ANTLR start "ruleValDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:312:1: ruleValDef returns [EObject current=null] : ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ( (lv_annotations_1_0= ruleAnnotationCall ) )* ruleVAL ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) this_KRONUS_ASSIGN_4= RULE_KRONUS_ASSIGN ( (lv_value_5_0= ruleValueOperation ) ) ) ;
    public final EObject ruleValDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token this_KRONUS_ASSIGN_4=null;
        EObject lv_hashtags_0_0 = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:315:28: ( ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ( (lv_annotations_1_0= ruleAnnotationCall ) )* ruleVAL ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) this_KRONUS_ASSIGN_4= RULE_KRONUS_ASSIGN ( (lv_value_5_0= ruleValueOperation ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:316:1: ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ( (lv_annotations_1_0= ruleAnnotationCall ) )* ruleVAL ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) this_KRONUS_ASSIGN_4= RULE_KRONUS_ASSIGN ( (lv_value_5_0= ruleValueOperation ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:316:1: ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ( (lv_annotations_1_0= ruleAnnotationCall ) )* ruleVAL ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) this_KRONUS_ASSIGN_4= RULE_KRONUS_ASSIGN ( (lv_value_5_0= ruleValueOperation ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:316:2: ( (lv_hashtags_0_0= ruleHashtagCall ) )* ( (lv_annotations_1_0= ruleAnnotationCall ) )* ruleVAL ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) this_KRONUS_ASSIGN_4= RULE_KRONUS_ASSIGN ( (lv_value_5_0= ruleValueOperation ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:316:2: ( (lv_hashtags_0_0= ruleHashtagCall ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:317:1: (lv_hashtags_0_0= ruleHashtagCall )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:317:1: (lv_hashtags_0_0= ruleHashtagCall )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:318:3: lv_hashtags_0_0= ruleHashtagCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValDefAccess().getHashtagsHashtagCallParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHashtagCall_in_ruleValDef631);
            	    lv_hashtags_0_0=ruleHashtagCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hashtags",
            	            		lv_hashtags_0_0, 
            	            		"HashtagCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:334:3: ( (lv_annotations_1_0= ruleAnnotationCall ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:335:1: (lv_annotations_1_0= ruleAnnotationCall )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:335:1: (lv_annotations_1_0= ruleAnnotationCall )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:336:3: lv_annotations_1_0= ruleAnnotationCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValDefAccess().getAnnotationsAnnotationCallParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotationCall_in_ruleValDef653);
            	    lv_annotations_1_0=ruleAnnotationCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_1_0, 
            	            		"AnnotationCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getValDefAccess().getVALParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleVAL_in_ruleValDef670);
            ruleVAL();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:360:1: ( (lv_name_3_0= RULE_CAPITALIZED_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:361:1: (lv_name_3_0= RULE_CAPITALIZED_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:361:1: (lv_name_3_0= RULE_CAPITALIZED_ID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:362:3: lv_name_3_0= RULE_CAPITALIZED_ID
            {
            lv_name_3_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleValDef686); 

            			newLeafNode(lv_name_3_0, grammarAccess.getValDefAccess().getNameCAPITALIZED_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"CAPITALIZED_ID");
            	    

            }


            }

            this_KRONUS_ASSIGN_4=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleValDef702); 
             
                newLeafNode(this_KRONUS_ASSIGN_4, grammarAccess.getValDefAccess().getKRONUS_ASSIGNTerminalRuleCall_4()); 
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:382:1: ( (lv_value_5_0= ruleValueOperation ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:383:1: (lv_value_5_0= ruleValueOperation )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:383:1: (lv_value_5_0= ruleValueOperation )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:384:3: lv_value_5_0= ruleValueOperation
            {
             
            	        newCompositeNode(grammarAccess.getValDefAccess().getValueValueOperationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValueOperation_in_ruleValDef722);
            lv_value_5_0=ruleValueOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValDefRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"ValueOperation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValDef"


    // $ANTLR start "entryRulePackageDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:408:1: entryRulePackageDef returns [EObject current=null] : iv_rulePackageDef= rulePackageDef EOF ;
    public final EObject entryRulePackageDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:409:2: (iv_rulePackageDef= rulePackageDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:410:2: iv_rulePackageDef= rulePackageDef EOF
            {
             newCompositeNode(grammarAccess.getPackageDefRule()); 
            pushFollow(FOLLOW_rulePackageDef_in_entryRulePackageDef758);
            iv_rulePackageDef=rulePackageDef();

            state._fsp--;

             current =iv_rulePackageDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDef768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDef"


    // $ANTLR start "rulePackageDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:417:1: rulePackageDef returns [EObject current=null] : ( rulePACKAGE ( (lv_module_1_0= ruleModuleParts ) ) ) ;
    public final EObject rulePackageDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_module_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:420:28: ( ( rulePACKAGE ( (lv_module_1_0= ruleModuleParts ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:421:1: ( rulePACKAGE ( (lv_module_1_0= ruleModuleParts ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:421:1: ( rulePACKAGE ( (lv_module_1_0= ruleModuleParts ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:422:5: rulePACKAGE ( (lv_module_1_0= ruleModuleParts ) )
            {
             
                    newCompositeNode(grammarAccess.getPackageDefAccess().getPACKAGEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePACKAGE_in_rulePackageDef809);
            rulePACKAGE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:429:1: ( (lv_module_1_0= ruleModuleParts ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:430:1: (lv_module_1_0= ruleModuleParts )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:430:1: (lv_module_1_0= ruleModuleParts )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:431:3: lv_module_1_0= ruleModuleParts
            {
             
            	        newCompositeNode(grammarAccess.getPackageDefAccess().getModuleModulePartsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleParts_in_rulePackageDef829);
            lv_module_1_0=ruleModuleParts();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDefRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_1_0, 
                    		"ModuleParts");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDef"


    // $ANTLR start "entryRuleImportDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:455:1: entryRuleImportDef returns [EObject current=null] : iv_ruleImportDef= ruleImportDef EOF ;
    public final EObject entryRuleImportDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:456:2: (iv_ruleImportDef= ruleImportDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:457:2: iv_ruleImportDef= ruleImportDef EOF
            {
             newCompositeNode(grammarAccess.getImportDefRule()); 
            pushFollow(FOLLOW_ruleImportDef_in_entryRuleImportDef865);
            iv_ruleImportDef=ruleImportDef();

            state._fsp--;

             current =iv_ruleImportDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDef875); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDef"


    // $ANTLR start "ruleImportDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:464:1: ruleImportDef returns [EObject current=null] : ( ruleIMPORT ( (lv_module_1_0= ruleModuleDef ) ) ) ;
    public final EObject ruleImportDef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_module_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:467:28: ( ( ruleIMPORT ( (lv_module_1_0= ruleModuleDef ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:468:1: ( ruleIMPORT ( (lv_module_1_0= ruleModuleDef ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:468:1: ( ruleIMPORT ( (lv_module_1_0= ruleModuleDef ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:469:5: ruleIMPORT ( (lv_module_1_0= ruleModuleDef ) )
            {
             
                    newCompositeNode(grammarAccess.getImportDefAccess().getIMPORTParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIMPORT_in_ruleImportDef916);
            ruleIMPORT();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:476:1: ( (lv_module_1_0= ruleModuleDef ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:477:1: (lv_module_1_0= ruleModuleDef )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:477:1: (lv_module_1_0= ruleModuleDef )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:478:3: lv_module_1_0= ruleModuleDef
            {
             
            	        newCompositeNode(grammarAccess.getImportDefAccess().getModuleModuleDefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleDef_in_ruleImportDef936);
            lv_module_1_0=ruleModuleDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportDefRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_1_0, 
                    		"ModuleDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDef"


    // $ANTLR start "entryRuleIncludeDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:502:1: entryRuleIncludeDef returns [EObject current=null] : iv_ruleIncludeDef= ruleIncludeDef EOF ;
    public final EObject entryRuleIncludeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:503:2: (iv_ruleIncludeDef= ruleIncludeDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:504:2: iv_ruleIncludeDef= ruleIncludeDef EOF
            {
             newCompositeNode(grammarAccess.getIncludeDefRule()); 
            pushFollow(FOLLOW_ruleIncludeDef_in_entryRuleIncludeDef972);
            iv_ruleIncludeDef=ruleIncludeDef();

            state._fsp--;

             current =iv_ruleIncludeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDef982); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeDef"


    // $ANTLR start "ruleIncludeDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:511:1: ruleIncludeDef returns [EObject current=null] : ( ruleINCLUDE ( (lv_module_1_0= ruleModuleDef ) ) ( ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) )? ) ;
    public final EObject ruleIncludeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_module_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:514:28: ( ( ruleINCLUDE ( (lv_module_1_0= ruleModuleDef ) ) ( ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:515:1: ( ruleINCLUDE ( (lv_module_1_0= ruleModuleDef ) ) ( ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:515:1: ( ruleINCLUDE ( (lv_module_1_0= ruleModuleDef ) ) ( ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:516:5: ruleINCLUDE ( (lv_module_1_0= ruleModuleDef ) ) ( ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getIncludeDefAccess().getINCLUDEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleINCLUDE_in_ruleIncludeDef1023);
            ruleINCLUDE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:523:1: ( (lv_module_1_0= ruleModuleDef ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:524:1: (lv_module_1_0= ruleModuleDef )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:524:1: (lv_module_1_0= ruleModuleDef )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:525:3: lv_module_1_0= ruleModuleDef
            {
             
            	        newCompositeNode(grammarAccess.getIncludeDefAccess().getModuleModuleDefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleDef_in_ruleIncludeDef1043);
            lv_module_1_0=ruleModuleDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIncludeDefRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_1_0, 
                    		"ModuleDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:541:2: ( ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:542:5: ruleAS ( (lv_name_3_0= RULE_CAPITALIZED_ID ) )
                    {
                     
                            newCompositeNode(grammarAccess.getIncludeDefAccess().getASParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleAS_in_ruleIncludeDef1060);
                    ruleAS();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:549:1: ( (lv_name_3_0= RULE_CAPITALIZED_ID ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:550:1: (lv_name_3_0= RULE_CAPITALIZED_ID )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:550:1: (lv_name_3_0= RULE_CAPITALIZED_ID )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:551:3: lv_name_3_0= RULE_CAPITALIZED_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleIncludeDef1076); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getIncludeDefAccess().getNameCAPITALIZED_IDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeDefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"CAPITALIZED_ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeDef"


    // $ANTLR start "entryRuleModulePart"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:575:1: entryRuleModulePart returns [String current=null] : iv_ruleModulePart= ruleModulePart EOF ;
    public final String entryRuleModulePart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModulePart = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:576:2: (iv_ruleModulePart= ruleModulePart EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:577:2: iv_ruleModulePart= ruleModulePart EOF
            {
             newCompositeNode(grammarAccess.getModulePartRule()); 
            pushFollow(FOLLOW_ruleModulePart_in_entryRuleModulePart1120);
            iv_ruleModulePart=ruleModulePart();

            state._fsp--;

             current =iv_ruleModulePart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulePart1131); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulePart"


    // $ANTLR start "ruleModulePart"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:584:1: ruleModulePart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= ruleID | this_Keywords_1= ruleKeywords ) ;
    public final AntlrDatatypeRuleToken ruleModulePart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;

        AntlrDatatypeRuleToken this_Keywords_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:587:28: ( (this_ID_0= ruleID | this_Keywords_1= ruleKeywords ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:588:1: (this_ID_0= ruleID | this_Keywords_1= ruleKeywords )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:588:1: (this_ID_0= ruleID | this_Keywords_1= ruleKeywords )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CAPITALIZED_ID||LA9_0==RULE_OTHER_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=19 && LA9_0<=31)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:589:5: this_ID_0= ruleID
                    {
                     
                            newCompositeNode(grammarAccess.getModulePartAccess().getIDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleID_in_ruleModulePart1178);
                    this_ID_0=ruleID();

                    state._fsp--;


                    		current.merge(this_ID_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:601:5: this_Keywords_1= ruleKeywords
                    {
                     
                            newCompositeNode(grammarAccess.getModulePartAccess().getKeywordsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKeywords_in_ruleModulePart1211);
                    this_Keywords_1=ruleKeywords();

                    state._fsp--;


                    		current.merge(this_Keywords_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulePart"


    // $ANTLR start "entryRuleModuleDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:619:1: entryRuleModuleDef returns [String current=null] : iv_ruleModuleDef= ruleModuleDef EOF ;
    public final String entryRuleModuleDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleDef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:623:2: (iv_ruleModuleDef= ruleModuleDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:624:2: iv_ruleModuleDef= ruleModuleDef EOF
            {
             newCompositeNode(grammarAccess.getModuleDefRule()); 
            pushFollow(FOLLOW_ruleModuleDef_in_entryRuleModuleDef1263);
            iv_ruleModuleDef=ruleModuleDef();

            state._fsp--;

             current =iv_ruleModuleDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDef1274); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModuleDef"


    // $ANTLR start "ruleModuleDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:634:1: ruleModuleDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ModuleParts_0= ruleModuleParts (kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf ) )? ) ;
    public final AntlrDatatypeRuleToken ruleModuleDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ModuleParts_0 = null;

        AntlrDatatypeRuleToken this_ModuleLeaf_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:638:28: ( (this_ModuleParts_0= ruleModuleParts (kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:639:1: (this_ModuleParts_0= ruleModuleParts (kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:639:1: (this_ModuleParts_0= ruleModuleParts (kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:640:5: this_ModuleParts_0= ruleModuleParts (kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf ) )?
            {
             
                    newCompositeNode(grammarAccess.getModuleDefAccess().getModulePartsParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleModuleParts_in_ruleModuleDef1325);
            this_ModuleParts_0=ruleModuleParts();

            state._fsp--;


            		current.merge(this_ModuleParts_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:650:1: (kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:651:2: kw= '.' (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf )
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleModuleDef1344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModuleDefAccess().getFullStopKeyword_1_0()); 
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:656:1: (kw= '_' | this_ModuleLeaf_3= ruleModuleLeaf )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==14) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==15) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:657:2: kw= '_'
                            {
                            kw=(Token)match(input,14,FOLLOW_14_in_ruleModuleDef1358); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getModuleDefAccess().get_Keyword_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:664:5: this_ModuleLeaf_3= ruleModuleLeaf
                            {
                             
                                    newCompositeNode(grammarAccess.getModuleDefAccess().getModuleLeafParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_ruleModuleLeaf_in_ruleModuleDef1386);
                            this_ModuleLeaf_3=ruleModuleLeaf();

                            state._fsp--;


                            		current.merge(this_ModuleLeaf_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModuleDef"


    // $ANTLR start "entryRuleModuleParts"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:685:1: entryRuleModuleParts returns [String current=null] : iv_ruleModuleParts= ruleModuleParts EOF ;
    public final String entryRuleModuleParts() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleParts = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:686:2: (iv_ruleModuleParts= ruleModuleParts EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:687:2: iv_ruleModuleParts= ruleModuleParts EOF
            {
             newCompositeNode(grammarAccess.getModulePartsRule()); 
            pushFollow(FOLLOW_ruleModuleParts_in_entryRuleModuleParts1439);
            iv_ruleModuleParts=ruleModuleParts();

            state._fsp--;

             current =iv_ruleModuleParts.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleParts1450); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleParts"


    // $ANTLR start "ruleModuleParts"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:694:1: ruleModuleParts returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ModulePart_0= ruleModulePart (kw= '.' this_ModulePart_2= ruleModulePart )* ) ;
    public final AntlrDatatypeRuleToken ruleModuleParts() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ModulePart_0 = null;

        AntlrDatatypeRuleToken this_ModulePart_2 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:697:28: ( (this_ModulePart_0= ruleModulePart (kw= '.' this_ModulePart_2= ruleModulePart )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:698:1: (this_ModulePart_0= ruleModulePart (kw= '.' this_ModulePart_2= ruleModulePart )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:698:1: (this_ModulePart_0= ruleModulePart (kw= '.' this_ModulePart_2= ruleModulePart )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:699:5: this_ModulePart_0= ruleModulePart (kw= '.' this_ModulePart_2= ruleModulePart )*
            {
             
                    newCompositeNode(grammarAccess.getModulePartsAccess().getModulePartParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleModulePart_in_ruleModuleParts1497);
            this_ModulePart_0=ruleModulePart();

            state._fsp--;


            		current.merge(this_ModulePart_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:709:1: (kw= '.' this_ModulePart_2= ruleModulePart )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_CAPITALIZED_ID||LA12_2==RULE_OTHER_ID||(LA12_2>=19 && LA12_2<=31)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:710:2: kw= '.' this_ModulePart_2= ruleModulePart
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleModuleParts1516); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getModulePartsAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getModulePartsAccess().getModulePartParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleModulePart_in_ruleModuleParts1538);
            	    this_ModulePart_2=ruleModulePart();

            	    state._fsp--;


            	    		current.merge(this_ModulePart_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleParts"


    // $ANTLR start "entryRuleModuleLeaf"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:734:1: entryRuleModuleLeaf returns [String current=null] : iv_ruleModuleLeaf= ruleModuleLeaf EOF ;
    public final String entryRuleModuleLeaf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleLeaf = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:738:2: (iv_ruleModuleLeaf= ruleModuleLeaf EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:739:2: iv_ruleModuleLeaf= ruleModuleLeaf EOF
            {
             newCompositeNode(grammarAccess.getModuleLeafRule()); 
            pushFollow(FOLLOW_ruleModuleLeaf_in_entryRuleModuleLeaf1592);
            iv_ruleModuleLeaf=ruleModuleLeaf();

            state._fsp--;

             current =iv_ruleModuleLeaf.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleLeaf1603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModuleLeaf"


    // $ANTLR start "ruleModuleLeaf"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:749:1: ruleModuleLeaf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_ModuleLeafPart_1= ruleModuleLeafPart (kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleModuleLeaf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ModuleLeafPart_1 = null;

        AntlrDatatypeRuleToken this_ModuleLeafPart_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:753:28: ( (kw= '{' this_ModuleLeafPart_1= ruleModuleLeafPart (kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart )* kw= '}' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:754:1: (kw= '{' this_ModuleLeafPart_1= ruleModuleLeafPart (kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart )* kw= '}' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:754:1: (kw= '{' this_ModuleLeafPart_1= ruleModuleLeafPart (kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart )* kw= '}' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:755:2: kw= '{' this_ModuleLeafPart_1= ruleModuleLeafPart (kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart )* kw= '}'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleModuleLeaf1645); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleLeafAccess().getLeftCurlyBracketKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getModuleLeafAccess().getModuleLeafPartParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleModuleLeafPart_in_ruleModuleLeaf1667);
            this_ModuleLeafPart_1=ruleModuleLeafPart();

            state._fsp--;


            		current.merge(this_ModuleLeafPart_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:771:1: (kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:772:2: kw= ',' this_ModuleLeafPart_3= ruleModuleLeafPart
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16_in_ruleModuleLeaf1686); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getModuleLeafAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getModuleLeafAccess().getModuleLeafPartParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleModuleLeafPart_in_ruleModuleLeaf1708);
            	    this_ModuleLeafPart_3=ruleModuleLeafPart();

            	    state._fsp--;


            	    		current.merge(this_ModuleLeafPart_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            kw=(Token)match(input,17,FOLLOW_17_in_ruleModuleLeaf1728); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleLeafAccess().getRightCurlyBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModuleLeaf"


    // $ANTLR start "entryRuleModuleLeafPart"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:805:1: entryRuleModuleLeafPart returns [String current=null] : iv_ruleModuleLeafPart= ruleModuleLeafPart EOF ;
    public final String entryRuleModuleLeafPart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleLeafPart = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:809:2: (iv_ruleModuleLeafPart= ruleModuleLeafPart EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:810:2: iv_ruleModuleLeafPart= ruleModuleLeafPart EOF
            {
             newCompositeNode(grammarAccess.getModuleLeafPartRule()); 
            pushFollow(FOLLOW_ruleModuleLeafPart_in_entryRuleModuleLeafPart1779);
            iv_ruleModuleLeafPart=ruleModuleLeafPart();

            state._fsp--;

             current =iv_ruleModuleLeafPart.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleLeafPart1790); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModuleLeafPart"


    // $ANTLR start "ruleModuleLeafPart"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:820:1: ruleModuleLeafPart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ModulePart_0= ruleModulePart (kw= '=>' this_ModulePart_2= ruleModulePart )? ) ;
    public final AntlrDatatypeRuleToken ruleModuleLeafPart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ModulePart_0 = null;

        AntlrDatatypeRuleToken this_ModulePart_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:824:28: ( (this_ModulePart_0= ruleModulePart (kw= '=>' this_ModulePart_2= ruleModulePart )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:825:1: (this_ModulePart_0= ruleModulePart (kw= '=>' this_ModulePart_2= ruleModulePart )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:825:1: (this_ModulePart_0= ruleModulePart (kw= '=>' this_ModulePart_2= ruleModulePart )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:826:5: this_ModulePart_0= ruleModulePart (kw= '=>' this_ModulePart_2= ruleModulePart )?
            {
             
                    newCompositeNode(grammarAccess.getModuleLeafPartAccess().getModulePartParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleModulePart_in_ruleModuleLeafPart1841);
            this_ModulePart_0=ruleModulePart();

            state._fsp--;


            		current.merge(this_ModulePart_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:836:1: (kw= '=>' this_ModulePart_2= ruleModulePart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:837:2: kw= '=>' this_ModulePart_2= ruleModulePart
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleModuleLeafPart1860); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModuleLeafPartAccess().getEqualsSignGreaterThanSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getModuleLeafPartAccess().getModulePartParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleModulePart_in_ruleModuleLeafPart1882);
                    this_ModulePart_2=ruleModulePart();

                    state._fsp--;


                    		current.merge(this_ModulePart_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModuleLeafPart"


    // $ANTLR start "entryRuleAS"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:864:1: entryRuleAS returns [String current=null] : iv_ruleAS= ruleAS EOF ;
    public final String entryRuleAS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAS = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:865:2: (iv_ruleAS= ruleAS EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:866:2: iv_ruleAS= ruleAS EOF
            {
             newCompositeNode(grammarAccess.getASRule()); 
            pushFollow(FOLLOW_ruleAS_in_entryRuleAS1934);
            iv_ruleAS=ruleAS();

            state._fsp--;

             current =iv_ruleAS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAS1945); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAS"


    // $ANTLR start "ruleAS"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:873:1: ruleAS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'as' ;
    public final AntlrDatatypeRuleToken ruleAS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:876:28: (kw= 'as' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:878:2: kw= 'as'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleAS1982); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getASAccess().getAsKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAS"


    // $ANTLR start "entryRuleDEF"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:891:1: entryRuleDEF returns [String current=null] : iv_ruleDEF= ruleDEF EOF ;
    public final String entryRuleDEF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDEF = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:892:2: (iv_ruleDEF= ruleDEF EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:893:2: iv_ruleDEF= ruleDEF EOF
            {
             newCompositeNode(grammarAccess.getDEFRule()); 
            pushFollow(FOLLOW_ruleDEF_in_entryRuleDEF2022);
            iv_ruleDEF=ruleDEF();

            state._fsp--;

             current =iv_ruleDEF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDEF2033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDEF"


    // $ANTLR start "ruleDEF"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:900:1: ruleDEF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'def' ;
    public final AntlrDatatypeRuleToken ruleDEF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:903:28: (kw= 'def' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:905:2: kw= 'def'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleDEF2070); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDEFAccess().getDefKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDEF"


    // $ANTLR start "entryRuleFALSE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:918:1: entryRuleFALSE returns [String current=null] : iv_ruleFALSE= ruleFALSE EOF ;
    public final String entryRuleFALSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFALSE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:919:2: (iv_ruleFALSE= ruleFALSE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:920:2: iv_ruleFALSE= ruleFALSE EOF
            {
             newCompositeNode(grammarAccess.getFALSERule()); 
            pushFollow(FOLLOW_ruleFALSE_in_entryRuleFALSE2110);
            iv_ruleFALSE=ruleFALSE();

            state._fsp--;

             current =iv_ruleFALSE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFALSE2121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFALSE"


    // $ANTLR start "ruleFALSE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:927:1: ruleFALSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'false' ;
    public final AntlrDatatypeRuleToken ruleFALSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:930:28: (kw= 'false' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:932:2: kw= 'false'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleFALSE2158); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFALSEAccess().getFalseKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFALSE"


    // $ANTLR start "entryRuleGENERATE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:945:1: entryRuleGENERATE returns [String current=null] : iv_ruleGENERATE= ruleGENERATE EOF ;
    public final String entryRuleGENERATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGENERATE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:946:2: (iv_ruleGENERATE= ruleGENERATE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:947:2: iv_ruleGENERATE= ruleGENERATE EOF
            {
             newCompositeNode(grammarAccess.getGENERATERule()); 
            pushFollow(FOLLOW_ruleGENERATE_in_entryRuleGENERATE2198);
            iv_ruleGENERATE=ruleGENERATE();

            state._fsp--;

             current =iv_ruleGENERATE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGENERATE2209); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGENERATE"


    // $ANTLR start "ruleGENERATE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:954:1: ruleGENERATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'generate' ;
    public final AntlrDatatypeRuleToken ruleGENERATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:957:28: (kw= 'generate' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:959:2: kw= 'generate'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleGENERATE2246); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getGENERATEAccess().getGenerateKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGENERATE"


    // $ANTLR start "entryRuleIMPORT"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:972:1: entryRuleIMPORT returns [String current=null] : iv_ruleIMPORT= ruleIMPORT EOF ;
    public final String entryRuleIMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMPORT = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:973:2: (iv_ruleIMPORT= ruleIMPORT EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:974:2: iv_ruleIMPORT= ruleIMPORT EOF
            {
             newCompositeNode(grammarAccess.getIMPORTRule()); 
            pushFollow(FOLLOW_ruleIMPORT_in_entryRuleIMPORT2286);
            iv_ruleIMPORT=ruleIMPORT();

            state._fsp--;

             current =iv_ruleIMPORT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIMPORT2297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMPORT"


    // $ANTLR start "ruleIMPORT"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:981:1: ruleIMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleIMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:984:28: (kw= 'import' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:986:2: kw= 'import'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleIMPORT2334); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIMPORTAccess().getImportKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMPORT"


    // $ANTLR start "entryRuleINCLUDE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:999:1: entryRuleINCLUDE returns [String current=null] : iv_ruleINCLUDE= ruleINCLUDE EOF ;
    public final String entryRuleINCLUDE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINCLUDE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1000:2: (iv_ruleINCLUDE= ruleINCLUDE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1001:2: iv_ruleINCLUDE= ruleINCLUDE EOF
            {
             newCompositeNode(grammarAccess.getINCLUDERule()); 
            pushFollow(FOLLOW_ruleINCLUDE_in_entryRuleINCLUDE2374);
            iv_ruleINCLUDE=ruleINCLUDE();

            state._fsp--;

             current =iv_ruleINCLUDE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINCLUDE2385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINCLUDE"


    // $ANTLR start "ruleINCLUDE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1008:1: ruleINCLUDE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'include' ;
    public final AntlrDatatypeRuleToken ruleINCLUDE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1011:28: (kw= 'include' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1013:2: kw= 'include'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleINCLUDE2422); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getINCLUDEAccess().getIncludeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINCLUDE"


    // $ANTLR start "entryRuleKRONUSKW"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1026:1: entryRuleKRONUSKW returns [String current=null] : iv_ruleKRONUSKW= ruleKRONUSKW EOF ;
    public final String entryRuleKRONUSKW() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKRONUSKW = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1027:2: (iv_ruleKRONUSKW= ruleKRONUSKW EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1028:2: iv_ruleKRONUSKW= ruleKRONUSKW EOF
            {
             newCompositeNode(grammarAccess.getKRONUSKWRule()); 
            pushFollow(FOLLOW_ruleKRONUSKW_in_entryRuleKRONUSKW2462);
            iv_ruleKRONUSKW=ruleKRONUSKW();

            state._fsp--;

             current =iv_ruleKRONUSKW.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKRONUSKW2473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKRONUSKW"


    // $ANTLR start "ruleKRONUSKW"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1035:1: ruleKRONUSKW returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'kronus' ;
    public final AntlrDatatypeRuleToken ruleKRONUSKW() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1038:28: (kw= 'kronus' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1040:2: kw= 'kronus'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleKRONUSKW2510); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getKRONUSKWAccess().getKronusKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKRONUSKW"


    // $ANTLR start "entryRulePACKAGE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1053:1: entryRulePACKAGE returns [String current=null] : iv_rulePACKAGE= rulePACKAGE EOF ;
    public final String entryRulePACKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePACKAGE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1054:2: (iv_rulePACKAGE= rulePACKAGE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1055:2: iv_rulePACKAGE= rulePACKAGE EOF
            {
             newCompositeNode(grammarAccess.getPACKAGERule()); 
            pushFollow(FOLLOW_rulePACKAGE_in_entryRulePACKAGE2550);
            iv_rulePACKAGE=rulePACKAGE();

            state._fsp--;

             current =iv_rulePACKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePACKAGE2561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePACKAGE"


    // $ANTLR start "rulePACKAGE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1062:1: rulePACKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'package' ;
    public final AntlrDatatypeRuleToken rulePACKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1065:28: (kw= 'package' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1067:2: kw= 'package'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_rulePACKAGE2598); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPACKAGEAccess().getPackageKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePACKAGE"


    // $ANTLR start "entryRuleRETURN"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1080:1: entryRuleRETURN returns [String current=null] : iv_ruleRETURN= ruleRETURN EOF ;
    public final String entryRuleRETURN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1081:2: (iv_ruleRETURN= ruleRETURN EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1082:2: iv_ruleRETURN= ruleRETURN EOF
            {
             newCompositeNode(grammarAccess.getRETURNRule()); 
            pushFollow(FOLLOW_ruleRETURN_in_entryRuleRETURN2638);
            iv_ruleRETURN=ruleRETURN();

            state._fsp--;

             current =iv_ruleRETURN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRETURN2649); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRETURN"


    // $ANTLR start "ruleRETURN"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1089:1: ruleRETURN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'return' ;
    public final AntlrDatatypeRuleToken ruleRETURN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1092:28: (kw= 'return' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1094:2: kw= 'return'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleRETURN2686); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRETURNAccess().getReturnKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRETURN"


    // $ANTLR start "entryRuleTRUE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1107:1: entryRuleTRUE returns [String current=null] : iv_ruleTRUE= ruleTRUE EOF ;
    public final String entryRuleTRUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTRUE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1108:2: (iv_ruleTRUE= ruleTRUE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1109:2: iv_ruleTRUE= ruleTRUE EOF
            {
             newCompositeNode(grammarAccess.getTRUERule()); 
            pushFollow(FOLLOW_ruleTRUE_in_entryRuleTRUE2726);
            iv_ruleTRUE=ruleTRUE();

            state._fsp--;

             current =iv_ruleTRUE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTRUE2737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTRUE"


    // $ANTLR start "ruleTRUE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1116:1: ruleTRUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'true' ;
    public final AntlrDatatypeRuleToken ruleTRUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1119:28: (kw= 'true' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1121:2: kw= 'true'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleTRUE2774); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTRUEAccess().getTrueKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTRUE"


    // $ANTLR start "entryRuleTYPE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1134:1: entryRuleTYPE returns [String current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final String entryRuleTYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1135:2: (iv_ruleTYPE= ruleTYPE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1136:2: iv_ruleTYPE= ruleTYPE EOF
            {
             newCompositeNode(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_ruleTYPE_in_entryRuleTYPE2814);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;

             current =iv_ruleTYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPE2825); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1143:1: ruleTYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'type' ;
    public final AntlrDatatypeRuleToken ruleTYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1146:28: (kw= 'type' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1148:2: kw= 'type'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleTYPE2862); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTYPEAccess().getTypeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleVAL"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1161:1: entryRuleVAL returns [String current=null] : iv_ruleVAL= ruleVAL EOF ;
    public final String entryRuleVAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAL = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1162:2: (iv_ruleVAL= ruleVAL EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1163:2: iv_ruleVAL= ruleVAL EOF
            {
             newCompositeNode(grammarAccess.getVALRule()); 
            pushFollow(FOLLOW_ruleVAL_in_entryRuleVAL2902);
            iv_ruleVAL=ruleVAL();

            state._fsp--;

             current =iv_ruleVAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAL2913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVAL"


    // $ANTLR start "ruleVAL"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1170:1: ruleVAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'val' ;
    public final AntlrDatatypeRuleToken ruleVAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1173:28: (kw= 'val' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1175:2: kw= 'val'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleVAL2950); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVALAccess().getValKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVAL"


    // $ANTLR start "entryRuleWITH"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1188:1: entryRuleWITH returns [String current=null] : iv_ruleWITH= ruleWITH EOF ;
    public final String entryRuleWITH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWITH = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1189:2: (iv_ruleWITH= ruleWITH EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1190:2: iv_ruleWITH= ruleWITH EOF
            {
             newCompositeNode(grammarAccess.getWITHRule()); 
            pushFollow(FOLLOW_ruleWITH_in_entryRuleWITH2990);
            iv_ruleWITH=ruleWITH();

            state._fsp--;

             current =iv_ruleWITH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWITH3001); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWITH"


    // $ANTLR start "ruleWITH"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1197:1: ruleWITH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'with' ;
    public final AntlrDatatypeRuleToken ruleWITH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1200:28: (kw= 'with' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1202:2: kw= 'with'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleWITH3038); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getWITHAccess().getWithKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWITH"


    // $ANTLR start "entryRuleKeywords"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1215:1: entryRuleKeywords returns [String current=null] : iv_ruleKeywords= ruleKeywords EOF ;
    public final String entryRuleKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeywords = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1216:2: (iv_ruleKeywords= ruleKeywords EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1217:2: iv_ruleKeywords= ruleKeywords EOF
            {
             newCompositeNode(grammarAccess.getKeywordsRule()); 
            pushFollow(FOLLOW_ruleKeywords_in_entryRuleKeywords3078);
            iv_ruleKeywords=ruleKeywords();

            state._fsp--;

             current =iv_ruleKeywords.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeywords3089); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeywords"


    // $ANTLR start "ruleKeywords"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1224:1: ruleKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AS_0= ruleAS | this_DEF_1= ruleDEF | this_FALSE_2= ruleFALSE | this_GENERATE_3= ruleGENERATE | this_IMPORT_4= ruleIMPORT | this_INCLUDE_5= ruleINCLUDE | this_KRONUSKW_6= ruleKRONUSKW | this_PACKAGE_7= rulePACKAGE | this_RETURN_8= ruleRETURN | this_TRUE_9= ruleTRUE | this_TYPE_10= ruleTYPE | this_VAL_11= ruleVAL | this_WITH_12= ruleWITH ) ;
    public final AntlrDatatypeRuleToken ruleKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AS_0 = null;

        AntlrDatatypeRuleToken this_DEF_1 = null;

        AntlrDatatypeRuleToken this_FALSE_2 = null;

        AntlrDatatypeRuleToken this_GENERATE_3 = null;

        AntlrDatatypeRuleToken this_IMPORT_4 = null;

        AntlrDatatypeRuleToken this_INCLUDE_5 = null;

        AntlrDatatypeRuleToken this_KRONUSKW_6 = null;

        AntlrDatatypeRuleToken this_PACKAGE_7 = null;

        AntlrDatatypeRuleToken this_RETURN_8 = null;

        AntlrDatatypeRuleToken this_TRUE_9 = null;

        AntlrDatatypeRuleToken this_TYPE_10 = null;

        AntlrDatatypeRuleToken this_VAL_11 = null;

        AntlrDatatypeRuleToken this_WITH_12 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1227:28: ( (this_AS_0= ruleAS | this_DEF_1= ruleDEF | this_FALSE_2= ruleFALSE | this_GENERATE_3= ruleGENERATE | this_IMPORT_4= ruleIMPORT | this_INCLUDE_5= ruleINCLUDE | this_KRONUSKW_6= ruleKRONUSKW | this_PACKAGE_7= rulePACKAGE | this_RETURN_8= ruleRETURN | this_TRUE_9= ruleTRUE | this_TYPE_10= ruleTYPE | this_VAL_11= ruleVAL | this_WITH_12= ruleWITH ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1228:1: (this_AS_0= ruleAS | this_DEF_1= ruleDEF | this_FALSE_2= ruleFALSE | this_GENERATE_3= ruleGENERATE | this_IMPORT_4= ruleIMPORT | this_INCLUDE_5= ruleINCLUDE | this_KRONUSKW_6= ruleKRONUSKW | this_PACKAGE_7= rulePACKAGE | this_RETURN_8= ruleRETURN | this_TRUE_9= ruleTRUE | this_TYPE_10= ruleTYPE | this_VAL_11= ruleVAL | this_WITH_12= ruleWITH )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1228:1: (this_AS_0= ruleAS | this_DEF_1= ruleDEF | this_FALSE_2= ruleFALSE | this_GENERATE_3= ruleGENERATE | this_IMPORT_4= ruleIMPORT | this_INCLUDE_5= ruleINCLUDE | this_KRONUSKW_6= ruleKRONUSKW | this_PACKAGE_7= rulePACKAGE | this_RETURN_8= ruleRETURN | this_TRUE_9= ruleTRUE | this_TYPE_10= ruleTYPE | this_VAL_11= ruleVAL | this_WITH_12= ruleWITH )
            int alt15=13;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt15=1;
                }
                break;
            case 20:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            case 22:
                {
                alt15=4;
                }
                break;
            case 23:
                {
                alt15=5;
                }
                break;
            case 24:
                {
                alt15=6;
                }
                break;
            case 25:
                {
                alt15=7;
                }
                break;
            case 26:
                {
                alt15=8;
                }
                break;
            case 27:
                {
                alt15=9;
                }
                break;
            case 28:
                {
                alt15=10;
                }
                break;
            case 29:
                {
                alt15=11;
                }
                break;
            case 30:
                {
                alt15=12;
                }
                break;
            case 31:
                {
                alt15=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1229:5: this_AS_0= ruleAS
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getASParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAS_in_ruleKeywords3136);
                    this_AS_0=ruleAS();

                    state._fsp--;


                    		current.merge(this_AS_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1241:5: this_DEF_1= ruleDEF
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getDEFParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDEF_in_ruleKeywords3169);
                    this_DEF_1=ruleDEF();

                    state._fsp--;


                    		current.merge(this_DEF_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1253:5: this_FALSE_2= ruleFALSE
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getFALSEParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFALSE_in_ruleKeywords3202);
                    this_FALSE_2=ruleFALSE();

                    state._fsp--;


                    		current.merge(this_FALSE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1265:5: this_GENERATE_3= ruleGENERATE
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getGENERATEParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGENERATE_in_ruleKeywords3235);
                    this_GENERATE_3=ruleGENERATE();

                    state._fsp--;


                    		current.merge(this_GENERATE_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1277:5: this_IMPORT_4= ruleIMPORT
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getIMPORTParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIMPORT_in_ruleKeywords3268);
                    this_IMPORT_4=ruleIMPORT();

                    state._fsp--;


                    		current.merge(this_IMPORT_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1289:5: this_INCLUDE_5= ruleINCLUDE
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getINCLUDEParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleINCLUDE_in_ruleKeywords3301);
                    this_INCLUDE_5=ruleINCLUDE();

                    state._fsp--;


                    		current.merge(this_INCLUDE_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1301:5: this_KRONUSKW_6= ruleKRONUSKW
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getKRONUSKWParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleKRONUSKW_in_ruleKeywords3334);
                    this_KRONUSKW_6=ruleKRONUSKW();

                    state._fsp--;


                    		current.merge(this_KRONUSKW_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1313:5: this_PACKAGE_7= rulePACKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getPACKAGEParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePACKAGE_in_ruleKeywords3367);
                    this_PACKAGE_7=rulePACKAGE();

                    state._fsp--;


                    		current.merge(this_PACKAGE_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1325:5: this_RETURN_8= ruleRETURN
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getRETURNParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_in_ruleKeywords3400);
                    this_RETURN_8=ruleRETURN();

                    state._fsp--;


                    		current.merge(this_RETURN_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1337:5: this_TRUE_9= ruleTRUE
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getTRUEParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleTRUE_in_ruleKeywords3433);
                    this_TRUE_9=ruleTRUE();

                    state._fsp--;


                    		current.merge(this_TRUE_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1349:5: this_TYPE_10= ruleTYPE
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getTYPEParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleTYPE_in_ruleKeywords3466);
                    this_TYPE_10=ruleTYPE();

                    state._fsp--;


                    		current.merge(this_TYPE_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1361:5: this_VAL_11= ruleVAL
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getVALParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleVAL_in_ruleKeywords3499);
                    this_VAL_11=ruleVAL();

                    state._fsp--;


                    		current.merge(this_VAL_11);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1373:5: this_WITH_12= ruleWITH
                    {
                     
                            newCompositeNode(grammarAccess.getKeywordsAccess().getWITHParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleWITH_in_ruleKeywords3532);
                    this_WITH_12=ruleWITH();

                    state._fsp--;


                    		current.merge(this_WITH_12);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeywords"


    // $ANTLR start "entryRuleTypeParameter"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1391:1: entryRuleTypeParameter returns [EObject current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final EObject entryRuleTypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameter = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1392:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1393:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter3577);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter3587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1400:1: ruleTypeParameter returns [EObject current=null] : ( ( ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) ) )? ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) ) )? ) ;
    public final EObject ruleTypeParameter() throws RecognitionException {
        EObject current = null;

        Token lv_variance_0_1=null;
        Token lv_variance_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_boundsHi_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1403:28: ( ( ( ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) ) )? ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1404:1: ( ( ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) ) )? ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1404:1: ( ( ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) ) )? ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1404:2: ( ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) ) )? ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) ) )?
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1404:2: ( ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1405:1: ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1405:1: ( (lv_variance_0_1= '+' | lv_variance_0_2= '-' ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1406:1: (lv_variance_0_1= '+' | lv_variance_0_2= '-' )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1406:1: (lv_variance_0_1= '+' | lv_variance_0_2= '-' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==32) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==33) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1407:3: lv_variance_0_1= '+'
                            {
                            lv_variance_0_1=(Token)match(input,32,FOLLOW_32_in_ruleTypeParameter3632); 

                                    newLeafNode(lv_variance_0_1, grammarAccess.getTypeParameterAccess().getVariancePlusSignKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "variance", lv_variance_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1419:8: lv_variance_0_2= '-'
                            {
                            lv_variance_0_2=(Token)match(input,33,FOLLOW_33_in_ruleTypeParameter3661); 

                                    newLeafNode(lv_variance_0_2, grammarAccess.getTypeParameterAccess().getVarianceHyphenMinusKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "variance", lv_variance_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1434:3: ( (lv_name_1_0= RULE_CAPITALIZED_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1435:1: (lv_name_1_0= RULE_CAPITALIZED_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1435:1: (lv_name_1_0= RULE_CAPITALIZED_ID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1436:3: lv_name_1_0= RULE_CAPITALIZED_ID
            {
            lv_name_1_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleTypeParameter3695); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeParameterAccess().getNameCAPITALIZED_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"CAPITALIZED_ID");
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1452:2: (otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1452:4: otherlv_2= '<:' ( (lv_boundsHi_3_0= ruleTypeInstance ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleTypeParameter3713); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeParameterAccess().getLessThanSignColonKeyword_2_0());
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1456:1: ( (lv_boundsHi_3_0= ruleTypeInstance ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1457:1: (lv_boundsHi_3_0= ruleTypeInstance )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1457:1: (lv_boundsHi_3_0= ruleTypeInstance )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1458:3: lv_boundsHi_3_0= ruleTypeInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeParameterAccess().getBoundsHiTypeInstanceParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeInstance_in_ruleTypeParameter3734);
                    lv_boundsHi_3_0=ruleTypeInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"boundsHi",
                            		lv_boundsHi_3_0, 
                            		"TypeInstance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleTypeDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1482:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1483:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1484:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef3772);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef3782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1491:1: ruleTypeDef returns [EObject current=null] : ( ruleTYPE ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']' )? (this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) ) )? ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_KRONUS_ASSIGN_7=null;
        EObject lv_typeParameters_3_0 = null;

        EObject lv_typeParameters_5_0 = null;

        EObject lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1494:28: ( ( ruleTYPE ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']' )? (this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1495:1: ( ruleTYPE ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']' )? (this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1495:1: ( ruleTYPE ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']' )? (this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1496:5: ruleTYPE ( (lv_name_1_0= RULE_CAPITALIZED_ID ) ) (otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']' )? (this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getTypeDefAccess().getTYPEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTYPE_in_ruleTypeDef3823);
            ruleTYPE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1503:1: ( (lv_name_1_0= RULE_CAPITALIZED_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1504:1: (lv_name_1_0= RULE_CAPITALIZED_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1504:1: (lv_name_1_0= RULE_CAPITALIZED_ID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1505:3: lv_name_1_0= RULE_CAPITALIZED_ID
            {
            lv_name_1_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleTypeDef3839); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameCAPITALIZED_IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"CAPITALIZED_ID");
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1521:2: (otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1521:4: otherlv_2= '[' ( (lv_typeParameters_3_0= ruleTypeParameter ) ) (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleTypeDef3857); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1525:1: ( (lv_typeParameters_3_0= ruleTypeParameter ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1526:1: (lv_typeParameters_3_0= ruleTypeParameter )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1526:1: (lv_typeParameters_3_0= ruleTypeParameter )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1527:3: lv_typeParameters_3_0= ruleTypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeParametersTypeParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTypeDef3878);
                    lv_typeParameters_3_0=ruleTypeParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	        }
                           		add(
                           			current, 
                           			"typeParameters",
                            		lv_typeParameters_3_0, 
                            		"TypeParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1543:2: (otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1543:4: otherlv_4= ',' ( (lv_typeParameters_5_0= ruleTypeParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTypeDef3891); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTypeDefAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1547:1: ( (lv_typeParameters_5_0= ruleTypeParameter ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1548:1: (lv_typeParameters_5_0= ruleTypeParameter )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1548:1: (lv_typeParameters_5_0= ruleTypeParameter )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1549:3: lv_typeParameters_5_0= ruleTypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeParametersTypeParameterParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTypeDef3912);
                    	    lv_typeParameters_5_0=ruleTypeParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"typeParameters",
                    	            		lv_typeParameters_5_0, 
                    	            		"TypeParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleTypeDef3926); 

                        	newLeafNode(otherlv_6, grammarAccess.getTypeDefAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1569:3: (this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_KRONUS_ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1569:4: this_KRONUS_ASSIGN_7= RULE_KRONUS_ASSIGN ( (lv_value_8_0= ruleTypeValue ) )
                    {
                    this_KRONUS_ASSIGN_7=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleTypeDef3940); 
                     
                        newLeafNode(this_KRONUS_ASSIGN_7, grammarAccess.getTypeDefAccess().getKRONUS_ASSIGNTerminalRuleCall_3_0()); 
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1573:1: ( (lv_value_8_0= ruleTypeValue ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1574:1: (lv_value_8_0= ruleTypeValue )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1574:1: (lv_value_8_0= ruleTypeValue )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1575:3: lv_value_8_0= ruleTypeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefAccess().getValueTypeValueParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeValue_in_ruleTypeDef3960);
                    lv_value_8_0=ruleTypeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"TypeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleTypeValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1599:1: entryRuleTypeValue returns [EObject current=null] : iv_ruleTypeValue= ruleTypeValue EOF ;
    public final EObject entryRuleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeValue = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1603:2: (iv_ruleTypeValue= ruleTypeValue EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1604:2: iv_ruleTypeValue= ruleTypeValue EOF
            {
             newCompositeNode(grammarAccess.getTypeValueRule()); 
            pushFollow(FOLLOW_ruleTypeValue_in_entryRuleTypeValue4004);
            iv_ruleTypeValue=ruleTypeValue();

            state._fsp--;

             current =iv_ruleTypeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeValue4014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTypeValue"


    // $ANTLR start "ruleTypeValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1614:1: ruleTypeValue returns [EObject current=null] : (this_TypeValueAtomic_0= ruleTypeValueAtomic ( ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) ) )* ) ;
    public final EObject ruleTypeValue() throws RecognitionException {
        EObject current = null;

        EObject this_TypeValueAtomic_0 = null;

        EObject lv_extensions_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1618:28: ( (this_TypeValueAtomic_0= ruleTypeValueAtomic ( ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1619:1: (this_TypeValueAtomic_0= ruleTypeValueAtomic ( ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1619:1: (this_TypeValueAtomic_0= ruleTypeValueAtomic ( ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1620:5: this_TypeValueAtomic_0= ruleTypeValueAtomic ( ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getTypeValueAccess().getTypeValueAtomicParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTypeValueAtomic_in_ruleTypeValue4065);
            this_TypeValueAtomic_0=ruleTypeValueAtomic();

            state._fsp--;

             
                    current = this_TypeValueAtomic_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1628:1: ( ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1629:5: ruleWITH ( (lv_extensions_2_0= ruleTypeValueAtomic ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTypeValueAccess().getWITHParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleWITH_in_ruleTypeValue4081);
            	    ruleWITH();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1636:1: ( (lv_extensions_2_0= ruleTypeValueAtomic ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1637:1: (lv_extensions_2_0= ruleTypeValueAtomic )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1637:1: (lv_extensions_2_0= ruleTypeValueAtomic )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1638:3: lv_extensions_2_0= ruleTypeValueAtomic
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypeValueAccess().getExtensionsTypeValueAtomicParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeValueAtomic_in_ruleTypeValue4101);
            	    lv_extensions_2_0=ruleTypeValueAtomic();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypeValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_2_0, 
            	            		"TypeValueAtomic");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTypeValue"


    // $ANTLR start "entryRuleTypeValueAtomic"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1665:1: entryRuleTypeValueAtomic returns [EObject current=null] : iv_ruleTypeValueAtomic= ruleTypeValueAtomic EOF ;
    public final EObject entryRuleTypeValueAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeValueAtomic = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1666:2: (iv_ruleTypeValueAtomic= ruleTypeValueAtomic EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1667:2: iv_ruleTypeValueAtomic= ruleTypeValueAtomic EOF
            {
             newCompositeNode(grammarAccess.getTypeValueAtomicRule()); 
            pushFollow(FOLLOW_ruleTypeValueAtomic_in_entryRuleTypeValueAtomic4143);
            iv_ruleTypeValueAtomic=ruleTypeValueAtomic();

            state._fsp--;

             current =iv_ruleTypeValueAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeValueAtomic4153); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeValueAtomic"


    // $ANTLR start "ruleTypeValueAtomic"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1674:1: ruleTypeValueAtomic returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeId ) ) (otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']' )? ) ;
    public final EObject ruleTypeValueAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_parms_2_0 = null;

        EObject lv_parms_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1677:28: ( ( ( (lv_type_0_0= ruleTypeId ) ) (otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']' )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1678:1: ( ( (lv_type_0_0= ruleTypeId ) ) (otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']' )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1678:1: ( ( (lv_type_0_0= ruleTypeId ) ) (otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']' )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1678:2: ( (lv_type_0_0= ruleTypeId ) ) (otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']' )?
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1678:2: ( (lv_type_0_0= ruleTypeId ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1679:1: (lv_type_0_0= ruleTypeId )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1679:1: (lv_type_0_0= ruleTypeId )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1680:3: lv_type_0_0= ruleTypeId
            {
             
            	        newCompositeNode(grammarAccess.getTypeValueAtomicAccess().getTypeTypeIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeId_in_ruleTypeValueAtomic4199);
            lv_type_0_0=ruleTypeId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeValueAtomicRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1696:2: (otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1696:4: otherlv_1= '[' ( (lv_parms_2_0= ruleTypeValue ) ) (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleTypeValueAtomic4212); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeValueAtomicAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1700:1: ( (lv_parms_2_0= ruleTypeValue ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1701:1: (lv_parms_2_0= ruleTypeValue )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1701:1: (lv_parms_2_0= ruleTypeValue )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1702:3: lv_parms_2_0= ruleTypeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeValueAtomicAccess().getParmsTypeValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeValue_in_ruleTypeValueAtomic4233);
                    lv_parms_2_0=ruleTypeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeValueAtomicRule());
                    	        }
                           		add(
                           			current, 
                           			"parms",
                            		lv_parms_2_0, 
                            		"TypeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1718:2: (otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1718:4: otherlv_3= ',' ( (lv_parms_4_0= ruleTypeValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTypeValueAtomic4246); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeValueAtomicAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1722:1: ( (lv_parms_4_0= ruleTypeValue ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1723:1: (lv_parms_4_0= ruleTypeValue )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1723:1: (lv_parms_4_0= ruleTypeValue )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1724:3: lv_parms_4_0= ruleTypeValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeValueAtomicAccess().getParmsTypeValueParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeValue_in_ruleTypeValueAtomic4267);
                    	    lv_parms_4_0=ruleTypeValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeValueAtomicRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parms",
                    	            		lv_parms_4_0, 
                    	            		"TypeValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleTypeValueAtomic4281); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeValueAtomicAccess().getRightSquareBracketKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeValueAtomic"


    // $ANTLR start "entryRuleTypeNameStr"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1752:1: entryRuleTypeNameStr returns [String current=null] : iv_ruleTypeNameStr= ruleTypeNameStr EOF ;
    public final String entryRuleTypeNameStr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeNameStr = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1756:2: (iv_ruleTypeNameStr= ruleTypeNameStr EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1757:2: iv_ruleTypeNameStr= ruleTypeNameStr EOF
            {
             newCompositeNode(grammarAccess.getTypeNameStrRule()); 
            pushFollow(FOLLOW_ruleTypeNameStr_in_entryRuleTypeNameStr4326);
            iv_ruleTypeNameStr=ruleTypeNameStr();

            state._fsp--;

             current =iv_ruleTypeNameStr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeNameStr4337); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameStr"


    // $ANTLR start "ruleTypeNameStr"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1767:1: ruleTypeNameStr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '_' | (this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeNameStr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ID_1 = null;

        AntlrDatatypeRuleToken this_ID_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1771:28: ( (kw= '_' | (this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )? ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1772:1: (kw= '_' | (this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )? ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1772:1: (kw= '_' | (this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_CAPITALIZED_ID||LA27_0==RULE_OTHER_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1773:2: kw= '_'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleTypeNameStr4379); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeNameStrAccess().get_Keyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1779:6: (this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )? )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1779:6: (this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )? )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1780:5: this_ID_1= ruleID (kw= '.' this_ID_3= ruleID )* (kw= '.' kw= '_' )?
                    {
                     
                            newCompositeNode(grammarAccess.getTypeNameStrAccess().getIDParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleID_in_ruleTypeNameStr4408);
                    this_ID_1=ruleID();

                    state._fsp--;


                    		current.merge(this_ID_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1790:1: (kw= '.' this_ID_3= ruleID )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==13) ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1==RULE_CAPITALIZED_ID||LA25_1==RULE_OTHER_ID) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1791:2: kw= '.' this_ID_3= ruleID
                    	    {
                    	    kw=(Token)match(input,13,FOLLOW_13_in_ruleTypeNameStr4427); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getTypeNameStrAccess().getFullStopKeyword_1_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getTypeNameStrAccess().getIDParserRuleCall_1_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleID_in_ruleTypeNameStr4449);
                    	    this_ID_3=ruleID();

                    	    state._fsp--;


                    	    		current.merge(this_ID_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1807:3: (kw= '.' kw= '_' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==13) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1808:2: kw= '.' kw= '_'
                            {
                            kw=(Token)match(input,13,FOLLOW_13_in_ruleTypeNameStr4470); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeNameStrAccess().getFullStopKeyword_1_2_0()); 
                                
                            kw=(Token)match(input,14,FOLLOW_14_in_ruleTypeNameStr4483); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeNameStrAccess().get_Keyword_1_2_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTypeNameStr"


    // $ANTLR start "entryRuleTypeName"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1830:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1831:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1832:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName4530);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName4540); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1839:1: ruleTypeName returns [EObject current=null] : ( (lv_name_0_0= ruleTypeNameStr ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1842:28: ( ( (lv_name_0_0= ruleTypeNameStr ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1843:1: ( (lv_name_0_0= ruleTypeNameStr ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1843:1: ( (lv_name_0_0= ruleTypeNameStr ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1844:1: (lv_name_0_0= ruleTypeNameStr )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1844:1: (lv_name_0_0= ruleTypeNameStr )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1845:3: lv_name_0_0= ruleTypeNameStr
            {
             
            	        newCompositeNode(grammarAccess.getTypeNameAccess().getNameTypeNameStrParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeNameStr_in_ruleTypeName4585);
            lv_name_0_0=ruleTypeNameStr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeNameRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TypeNameStr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeRef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1869:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1873:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1874:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef4626);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef4636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1884:1: ruleTypeRef returns [EObject current=null] : (otherlv_0= '$' ( ( ruleID ) ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1888:28: ( (otherlv_0= '$' ( ( ruleID ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1889:1: (otherlv_0= '$' ( ( ruleID ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1889:1: (otherlv_0= '$' ( ( ruleID ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1889:3: otherlv_0= '$' ( ( ruleID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTypeRef4677); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getDollarSignKeyword_0());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1893:1: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1894:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1894:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1895:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeRefAccess().getTypeRefTypeDefCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleTypeRef4700);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleTypeId"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1919:1: entryRuleTypeId returns [EObject current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final EObject entryRuleTypeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeId = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1920:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1921:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId4740);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId4750); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1928:1: ruleTypeId returns [EObject current=null] : (this_TypeName_0= ruleTypeName | this_TypeRef_1= ruleTypeRef ) ;
    public final EObject ruleTypeId() throws RecognitionException {
        EObject current = null;

        EObject this_TypeName_0 = null;

        EObject this_TypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1931:28: ( (this_TypeName_0= ruleTypeName | this_TypeRef_1= ruleTypeRef ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1932:1: (this_TypeName_0= ruleTypeName | this_TypeRef_1= ruleTypeRef )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1932:1: (this_TypeName_0= ruleTypeName | this_TypeRef_1= ruleTypeRef )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_CAPITALIZED_ID||LA28_0==RULE_OTHER_ID||LA28_0==14) ) {
                alt28=1;
            }
            else if ( (LA28_0==37) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1933:5: this_TypeName_0= ruleTypeName
                    {
                     
                            newCompositeNode(grammarAccess.getTypeIdAccess().getTypeNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeName_in_ruleTypeId4797);
                    this_TypeName_0=ruleTypeName();

                    state._fsp--;

                     
                            current = this_TypeName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1943:5: this_TypeRef_1= ruleTypeRef
                    {
                     
                            newCompositeNode(grammarAccess.getTypeIdAccess().getTypeRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeId4824);
                    this_TypeRef_1=ruleTypeRef();

                    state._fsp--;

                     
                            current = this_TypeRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleTypeInstance"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1959:1: entryRuleTypeInstance returns [EObject current=null] : iv_ruleTypeInstance= ruleTypeInstance EOF ;
    public final EObject entryRuleTypeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeInstance = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1960:2: (iv_ruleTypeInstance= ruleTypeInstance EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1961:2: iv_ruleTypeInstance= ruleTypeInstance EOF
            {
             newCompositeNode(grammarAccess.getTypeInstanceRule()); 
            pushFollow(FOLLOW_ruleTypeInstance_in_entryRuleTypeInstance4859);
            iv_ruleTypeInstance=ruleTypeInstance();

            state._fsp--;

             current =iv_ruleTypeInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeInstance4869); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeInstance"


    // $ANTLR start "ruleTypeInstance"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1968:1: ruleTypeInstance returns [EObject current=null] : ( ( ( ruleID ) ) (otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']' )? ) ;
    public final EObject ruleTypeInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_typeParameters_2_0 = null;

        EObject lv_typeParameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1971:28: ( ( ( ( ruleID ) ) (otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']' )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1972:1: ( ( ( ruleID ) ) (otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']' )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1972:1: ( ( ( ruleID ) ) (otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']' )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1972:2: ( ( ruleID ) ) (otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']' )?
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1972:2: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1973:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1973:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1974:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTypeInstanceAccess().getNameTypeDefCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleTypeInstance4917);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1987:2: (otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1987:4: otherlv_1= '[' ( (lv_typeParameters_2_0= ruleTypeInstance ) ) (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleTypeInstance4930); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeInstanceAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1991:1: ( (lv_typeParameters_2_0= ruleTypeInstance ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1992:1: (lv_typeParameters_2_0= ruleTypeInstance )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1992:1: (lv_typeParameters_2_0= ruleTypeInstance )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:1993:3: lv_typeParameters_2_0= ruleTypeInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeInstanceAccess().getTypeParametersTypeInstanceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeInstance_in_ruleTypeInstance4951);
                    lv_typeParameters_2_0=ruleTypeInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"typeParameters",
                            		lv_typeParameters_2_0, 
                            		"TypeInstance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2009:2: (otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2009:4: otherlv_3= ',' ( (lv_typeParameters_4_0= ruleTypeInstance ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTypeInstance4964); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeInstanceAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2013:1: ( (lv_typeParameters_4_0= ruleTypeInstance ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2014:1: (lv_typeParameters_4_0= ruleTypeInstance )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2014:1: (lv_typeParameters_4_0= ruleTypeInstance )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2015:3: lv_typeParameters_4_0= ruleTypeInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeInstanceAccess().getTypeParametersTypeInstanceParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeInstance_in_ruleTypeInstance4985);
                    	    lv_typeParameters_4_0=ruleTypeInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"typeParameters",
                    	            		lv_typeParameters_4_0, 
                    	            		"TypeInstance");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleTypeInstance4999); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeInstanceAccess().getRightSquareBracketKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeInstance"


    // $ANTLR start "entryRuleFunctionDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2043:1: entryRuleFunctionDef returns [EObject current=null] : iv_ruleFunctionDef= ruleFunctionDef EOF ;
    public final EObject entryRuleFunctionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2044:2: (iv_ruleFunctionDef= ruleFunctionDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2045:2: iv_ruleFunctionDef= ruleFunctionDef EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefRule()); 
            pushFollow(FOLLOW_ruleFunctionDef_in_entryRuleFunctionDef5037);
            iv_ruleFunctionDef=ruleFunctionDef();

            state._fsp--;

             current =iv_ruleFunctionDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDef5047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDef"


    // $ANTLR start "ruleFunctionDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2052:1: ruleFunctionDef returns [EObject current=null] : ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ruleDEF ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) (otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']' )? otherlv_8= '(' ( ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_returnType_14_0= ruleTypeInstance ) ) ( (lv_value_15_0= ruleCodeAssignment ) )? ) ;
    public final EObject ruleFunctionDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_hashtags_0_0 = null;

        EObject lv_typeParameters_4_0 = null;

        EObject lv_typeParameters_6_0 = null;

        EObject lv_parameterDefs_9_0 = null;

        EObject lv_parameterDefs_11_0 = null;

        EObject lv_returnType_14_0 = null;

        EObject lv_value_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2055:28: ( ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ruleDEF ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) (otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']' )? otherlv_8= '(' ( ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_returnType_14_0= ruleTypeInstance ) ) ( (lv_value_15_0= ruleCodeAssignment ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2056:1: ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ruleDEF ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) (otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']' )? otherlv_8= '(' ( ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_returnType_14_0= ruleTypeInstance ) ) ( (lv_value_15_0= ruleCodeAssignment ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2056:1: ( ( (lv_hashtags_0_0= ruleHashtagCall ) )* ruleDEF ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) (otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']' )? otherlv_8= '(' ( ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_returnType_14_0= ruleTypeInstance ) ) ( (lv_value_15_0= ruleCodeAssignment ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2056:2: ( (lv_hashtags_0_0= ruleHashtagCall ) )* ruleDEF ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) (otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']' )? otherlv_8= '(' ( ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )* )? otherlv_12= ')' otherlv_13= ':' ( (lv_returnType_14_0= ruleTypeInstance ) ) ( (lv_value_15_0= ruleCodeAssignment ) )?
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2056:2: ( (lv_hashtags_0_0= ruleHashtagCall ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2057:1: (lv_hashtags_0_0= ruleHashtagCall )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2057:1: (lv_hashtags_0_0= ruleHashtagCall )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2058:3: lv_hashtags_0_0= ruleHashtagCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionDefAccess().getHashtagsHashtagCallParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHashtagCall_in_ruleFunctionDef5093);
            	    lv_hashtags_0_0=ruleHashtagCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hashtags",
            	            		lv_hashtags_0_0, 
            	            		"HashtagCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getFunctionDefAccess().getDEFParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleDEF_in_ruleFunctionDef5110);
            ruleDEF();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2082:1: ( (lv_name_2_0= RULE_CAPITALIZED_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2083:1: (lv_name_2_0= RULE_CAPITALIZED_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2083:1: (lv_name_2_0= RULE_CAPITALIZED_ID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2084:3: lv_name_2_0= RULE_CAPITALIZED_ID
            {
            lv_name_2_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleFunctionDef5126); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFunctionDefAccess().getNameCAPITALIZED_IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"CAPITALIZED_ID");
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2100:2: (otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2100:4: otherlv_3= '[' ( (lv_typeParameters_4_0= ruleTypeParameter ) ) (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleFunctionDef5144); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionDefAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2104:1: ( (lv_typeParameters_4_0= ruleTypeParameter ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2105:1: (lv_typeParameters_4_0= ruleTypeParameter )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2105:1: (lv_typeParameters_4_0= ruleTypeParameter )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2106:3: lv_typeParameters_4_0= ruleTypeParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefAccess().getTypeParametersTypeParameterParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleFunctionDef5165);
                    lv_typeParameters_4_0=ruleTypeParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	        }
                           		add(
                           			current, 
                           			"typeParameters",
                            		lv_typeParameters_4_0, 
                            		"TypeParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2122:2: (otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2122:4: otherlv_5= ',' ( (lv_typeParameters_6_0= ruleTypeParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDef5178); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFunctionDefAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2126:1: ( (lv_typeParameters_6_0= ruleTypeParameter ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2127:1: (lv_typeParameters_6_0= ruleTypeParameter )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2127:1: (lv_typeParameters_6_0= ruleTypeParameter )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2128:3: lv_typeParameters_6_0= ruleTypeParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefAccess().getTypeParametersTypeParameterParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeParameter_in_ruleFunctionDef5199);
                    	    lv_typeParameters_6_0=ruleTypeParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"typeParameters",
                    	            		lv_typeParameters_6_0, 
                    	            		"TypeParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleFunctionDef5213); 

                        	newLeafNode(otherlv_7, grammarAccess.getFunctionDefAccess().getRightSquareBracketKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleFunctionDef5227); 

                	newLeafNode(otherlv_8, grammarAccess.getFunctionDefAccess().getLeftParenthesisKeyword_4());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2152:1: ( ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_CAPITALIZED_ID||LA35_0==RULE_OTHER_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2152:2: ( (lv_parameterDefs_9_0= ruleParameterDef ) ) (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2152:2: ( (lv_parameterDefs_9_0= ruleParameterDef ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2153:1: (lv_parameterDefs_9_0= ruleParameterDef )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2153:1: (lv_parameterDefs_9_0= ruleParameterDef )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2154:3: lv_parameterDefs_9_0= ruleParameterDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefAccess().getParameterDefsParameterDefParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterDef_in_ruleFunctionDef5249);
                    lv_parameterDefs_9_0=ruleParameterDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterDefs",
                            		lv_parameterDefs_9_0, 
                            		"ParameterDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2170:2: (otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2170:4: otherlv_10= ',' ( (lv_parameterDefs_11_0= ruleParameterDef ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDef5262); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getFunctionDefAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2174:1: ( (lv_parameterDefs_11_0= ruleParameterDef ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2175:1: (lv_parameterDefs_11_0= ruleParameterDef )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2175:1: (lv_parameterDefs_11_0= ruleParameterDef )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2176:3: lv_parameterDefs_11_0= ruleParameterDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionDefAccess().getParameterDefsParameterDefParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterDef_in_ruleFunctionDef5283);
                    	    lv_parameterDefs_11_0=ruleParameterDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterDefs",
                    	            		lv_parameterDefs_11_0, 
                    	            		"ParameterDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleFunctionDef5299); 

                	newLeafNode(otherlv_12, grammarAccess.getFunctionDefAccess().getRightParenthesisKeyword_6());
                
            otherlv_13=(Token)match(input,40,FOLLOW_40_in_ruleFunctionDef5311); 

                	newLeafNode(otherlv_13, grammarAccess.getFunctionDefAccess().getColonKeyword_7());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2200:1: ( (lv_returnType_14_0= ruleTypeInstance ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2201:1: (lv_returnType_14_0= ruleTypeInstance )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2201:1: (lv_returnType_14_0= ruleTypeInstance )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2202:3: lv_returnType_14_0= ruleTypeInstance
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDefAccess().getReturnTypeTypeInstanceParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeInstance_in_ruleFunctionDef5332);
            lv_returnType_14_0=ruleTypeInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_14_0, 
                    		"TypeInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2218:2: ( (lv_value_15_0= ruleCodeAssignment ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_KRONUS_ASSIGN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2219:1: (lv_value_15_0= ruleCodeAssignment )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2219:1: (lv_value_15_0= ruleCodeAssignment )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2220:3: lv_value_15_0= ruleCodeAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefAccess().getValueCodeAssignmentParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCodeAssignment_in_ruleFunctionDef5353);
                    lv_value_15_0=ruleCodeAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_15_0, 
                            		"CodeAssignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDef"


    // $ANTLR start "entryRuleAnnotationDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2244:1: entryRuleAnnotationDef returns [EObject current=null] : iv_ruleAnnotationDef= ruleAnnotationDef EOF ;
    public final EObject entryRuleAnnotationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2245:2: (iv_ruleAnnotationDef= ruleAnnotationDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2246:2: iv_ruleAnnotationDef= ruleAnnotationDef EOF
            {
             newCompositeNode(grammarAccess.getAnnotationDefRule()); 
            pushFollow(FOLLOW_ruleAnnotationDef_in_entryRuleAnnotationDef5390);
            iv_ruleAnnotationDef=ruleAnnotationDef();

            state._fsp--;

             current =iv_ruleAnnotationDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationDef5400); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationDef"


    // $ANTLR start "ruleAnnotationDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2253:1: ruleAnnotationDef returns [EObject current=null] : ( ruleDEF otherlv_1= '@' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleAnnotationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameterDefs_4_0 = null;

        EObject lv_parameterDefs_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2256:28: ( ( ruleDEF otherlv_1= '@' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2257:1: ( ruleDEF otherlv_1= '@' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2257:1: ( ruleDEF otherlv_1= '@' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2258:5: ruleDEF otherlv_1= '@' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')'
            {
             
                    newCompositeNode(grammarAccess.getAnnotationDefAccess().getDEFParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDEF_in_ruleAnnotationDef5441);
            ruleDEF();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleAnnotationDef5452); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationDefAccess().getCommercialAtKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2269:1: ( (lv_name_2_0= RULE_CAPITALIZED_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2270:1: (lv_name_2_0= RULE_CAPITALIZED_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2270:1: (lv_name_2_0= RULE_CAPITALIZED_ID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2271:3: lv_name_2_0= RULE_CAPITALIZED_ID
            {
            lv_name_2_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleAnnotationDef5469); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAnnotationDefAccess().getNameCAPITALIZED_IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"CAPITALIZED_ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleAnnotationDef5486); 

                	newLeafNode(otherlv_3, grammarAccess.getAnnotationDefAccess().getLeftParenthesisKeyword_3());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2291:1: ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_CAPITALIZED_ID||LA38_0==RULE_OTHER_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2291:2: ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2291:2: ( (lv_parameterDefs_4_0= ruleParameterDef ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2292:1: (lv_parameterDefs_4_0= ruleParameterDef )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2292:1: (lv_parameterDefs_4_0= ruleParameterDef )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2293:3: lv_parameterDefs_4_0= ruleParameterDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationDefAccess().getParameterDefsParameterDefParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterDef_in_ruleAnnotationDef5508);
                    lv_parameterDefs_4_0=ruleParameterDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationDefRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterDefs",
                            		lv_parameterDefs_4_0, 
                            		"ParameterDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2309:2: (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==16) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2309:4: otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAnnotationDef5521); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAnnotationDefAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2313:1: ( (lv_parameterDefs_6_0= ruleParameterDef ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2314:1: (lv_parameterDefs_6_0= ruleParameterDef )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2314:1: (lv_parameterDefs_6_0= ruleParameterDef )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2315:3: lv_parameterDefs_6_0= ruleParameterDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationDefAccess().getParameterDefsParameterDefParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterDef_in_ruleAnnotationDef5542);
                    	    lv_parameterDefs_6_0=ruleParameterDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterDefs",
                    	            		lv_parameterDefs_6_0, 
                    	            		"ParameterDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleAnnotationDef5558); 

                	newLeafNode(otherlv_7, grammarAccess.getAnnotationDefAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationDef"


    // $ANTLR start "entryRuleHashtagDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2343:1: entryRuleHashtagDef returns [EObject current=null] : iv_ruleHashtagDef= ruleHashtagDef EOF ;
    public final EObject entryRuleHashtagDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashtagDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2344:2: (iv_ruleHashtagDef= ruleHashtagDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2345:2: iv_ruleHashtagDef= ruleHashtagDef EOF
            {
             newCompositeNode(grammarAccess.getHashtagDefRule()); 
            pushFollow(FOLLOW_ruleHashtagDef_in_entryRuleHashtagDef5594);
            iv_ruleHashtagDef=ruleHashtagDef();

            state._fsp--;

             current =iv_ruleHashtagDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashtagDef5604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHashtagDef"


    // $ANTLR start "ruleHashtagDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2352:1: ruleHashtagDef returns [EObject current=null] : ( ruleDEF otherlv_1= '#' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleHashtagDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameterDefs_4_0 = null;

        EObject lv_parameterDefs_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2355:28: ( ( ruleDEF otherlv_1= '#' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2356:1: ( ruleDEF otherlv_1= '#' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2356:1: ( ruleDEF otherlv_1= '#' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2357:5: ruleDEF otherlv_1= '#' ( (lv_name_2_0= RULE_CAPITALIZED_ID ) ) otherlv_3= '(' ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )? otherlv_7= ')'
            {
             
                    newCompositeNode(grammarAccess.getHashtagDefAccess().getDEFParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDEF_in_ruleHashtagDef5645);
            ruleDEF();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleHashtagDef5656); 

                	newLeafNode(otherlv_1, grammarAccess.getHashtagDefAccess().getNumberSignKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2368:1: ( (lv_name_2_0= RULE_CAPITALIZED_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2369:1: (lv_name_2_0= RULE_CAPITALIZED_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2369:1: (lv_name_2_0= RULE_CAPITALIZED_ID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2370:3: lv_name_2_0= RULE_CAPITALIZED_ID
            {
            lv_name_2_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleHashtagDef5673); 

            			newLeafNode(lv_name_2_0, grammarAccess.getHashtagDefAccess().getNameCAPITALIZED_IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHashtagDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"CAPITALIZED_ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleHashtagDef5690); 

                	newLeafNode(otherlv_3, grammarAccess.getHashtagDefAccess().getLeftParenthesisKeyword_3());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2390:1: ( ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_CAPITALIZED_ID||LA40_0==RULE_OTHER_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2390:2: ( (lv_parameterDefs_4_0= ruleParameterDef ) ) (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2390:2: ( (lv_parameterDefs_4_0= ruleParameterDef ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2391:1: (lv_parameterDefs_4_0= ruleParameterDef )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2391:1: (lv_parameterDefs_4_0= ruleParameterDef )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2392:3: lv_parameterDefs_4_0= ruleParameterDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getHashtagDefAccess().getParameterDefsParameterDefParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterDef_in_ruleHashtagDef5712);
                    lv_parameterDefs_4_0=ruleParameterDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHashtagDefRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterDefs",
                            		lv_parameterDefs_4_0, 
                            		"ParameterDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2408:2: (otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==16) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2408:4: otherlv_5= ',' ( (lv_parameterDefs_6_0= ruleParameterDef ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleHashtagDef5725); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getHashtagDefAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2412:1: ( (lv_parameterDefs_6_0= ruleParameterDef ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2413:1: (lv_parameterDefs_6_0= ruleParameterDef )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2413:1: (lv_parameterDefs_6_0= ruleParameterDef )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2414:3: lv_parameterDefs_6_0= ruleParameterDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHashtagDefAccess().getParameterDefsParameterDefParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterDef_in_ruleHashtagDef5746);
                    	    lv_parameterDefs_6_0=ruleParameterDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHashtagDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterDefs",
                    	            		lv_parameterDefs_6_0, 
                    	            		"ParameterDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleHashtagDef5762); 

                	newLeafNode(otherlv_7, grammarAccess.getHashtagDefAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHashtagDef"


    // $ANTLR start "entryRuleCodeAssignment"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2442:1: entryRuleCodeAssignment returns [EObject current=null] : iv_ruleCodeAssignment= ruleCodeAssignment EOF ;
    public final EObject entryRuleCodeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeAssignment = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2443:2: (iv_ruleCodeAssignment= ruleCodeAssignment EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2444:2: iv_ruleCodeAssignment= ruleCodeAssignment EOF
            {
             newCompositeNode(grammarAccess.getCodeAssignmentRule()); 
            pushFollow(FOLLOW_ruleCodeAssignment_in_entryRuleCodeAssignment5798);
            iv_ruleCodeAssignment=ruleCodeAssignment();

            state._fsp--;

             current =iv_ruleCodeAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeAssignment5808); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeAssignment"


    // $ANTLR start "ruleCodeAssignment"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2451:1: ruleCodeAssignment returns [EObject current=null] : (this_KRONUS_ASSIGN_0= RULE_KRONUS_ASSIGN this_CodeBlock_1= ruleCodeBlock ) ;
    public final EObject ruleCodeAssignment() throws RecognitionException {
        EObject current = null;

        Token this_KRONUS_ASSIGN_0=null;
        EObject this_CodeBlock_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2454:28: ( (this_KRONUS_ASSIGN_0= RULE_KRONUS_ASSIGN this_CodeBlock_1= ruleCodeBlock ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2455:1: (this_KRONUS_ASSIGN_0= RULE_KRONUS_ASSIGN this_CodeBlock_1= ruleCodeBlock )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2455:1: (this_KRONUS_ASSIGN_0= RULE_KRONUS_ASSIGN this_CodeBlock_1= ruleCodeBlock )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2455:2: this_KRONUS_ASSIGN_0= RULE_KRONUS_ASSIGN this_CodeBlock_1= ruleCodeBlock
            {
            this_KRONUS_ASSIGN_0=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleCodeAssignment5844); 
             
                newLeafNode(this_KRONUS_ASSIGN_0, grammarAccess.getCodeAssignmentAccess().getKRONUS_ASSIGNTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getCodeAssignmentAccess().getCodeBlockParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCodeBlock_in_ruleCodeAssignment5865);
            this_CodeBlock_1=ruleCodeBlock();

            state._fsp--;

             
                    current = this_CodeBlock_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeAssignment"


    // $ANTLR start "entryRuleCodeBlock"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2476:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2477:2: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2478:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5900);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeBlock5910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2485:1: ruleCodeBlock returns [EObject current=null] : (this_ScalaCodeBlock_0= ruleScalaCodeBlock | this_KronusCodeBlock_1= ruleKronusCodeBlock ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject this_ScalaCodeBlock_0 = null;

        EObject this_KronusCodeBlock_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2488:28: ( (this_ScalaCodeBlock_0= ruleScalaCodeBlock | this_KronusCodeBlock_1= ruleKronusCodeBlock ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2489:1: (this_ScalaCodeBlock_0= ruleScalaCodeBlock | this_KronusCodeBlock_1= ruleKronusCodeBlock )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2489:1: (this_ScalaCodeBlock_0= ruleScalaCodeBlock | this_KronusCodeBlock_1= ruleKronusCodeBlock )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            else if ( (LA41_0==15||LA41_0==25) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2490:5: this_ScalaCodeBlock_0= ruleScalaCodeBlock
                    {
                     
                            newCompositeNode(grammarAccess.getCodeBlockAccess().getScalaCodeBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScalaCodeBlock_in_ruleCodeBlock5957);
                    this_ScalaCodeBlock_0=ruleScalaCodeBlock();

                    state._fsp--;

                     
                            current = this_ScalaCodeBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2500:5: this_KronusCodeBlock_1= ruleKronusCodeBlock
                    {
                     
                            newCompositeNode(grammarAccess.getCodeBlockAccess().getKronusCodeBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKronusCodeBlock_in_ruleCodeBlock5984);
                    this_KronusCodeBlock_1=ruleKronusCodeBlock();

                    state._fsp--;

                     
                            current = this_KronusCodeBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleScalaCodeBlock"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2516:1: entryRuleScalaCodeBlock returns [EObject current=null] : iv_ruleScalaCodeBlock= ruleScalaCodeBlock EOF ;
    public final EObject entryRuleScalaCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalaCodeBlock = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2517:2: (iv_ruleScalaCodeBlock= ruleScalaCodeBlock EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2518:2: iv_ruleScalaCodeBlock= ruleScalaCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getScalaCodeBlockRule()); 
            pushFollow(FOLLOW_ruleScalaCodeBlock_in_entryRuleScalaCodeBlock6019);
            iv_ruleScalaCodeBlock=ruleScalaCodeBlock();

            state._fsp--;

             current =iv_ruleScalaCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalaCodeBlock6029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalaCodeBlock"


    // $ANTLR start "ruleScalaCodeBlock"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2525:1: ruleScalaCodeBlock returns [EObject current=null] : ( ruleGENERATE otherlv_1= '(' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK ) ) ) ;
    public final EObject ruleScalaCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_codeStr_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2528:28: ( ( ruleGENERATE otherlv_1= '(' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2529:1: ( ruleGENERATE otherlv_1= '(' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2529:1: ( ruleGENERATE otherlv_1= '(' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2530:5: ruleGENERATE otherlv_1= '(' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= ')' ( (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK ) )
            {
             
                    newCompositeNode(grammarAccess.getScalaCodeBlockAccess().getGENERATEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleGENERATE_in_ruleScalaCodeBlock6070);
            ruleGENERATE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleScalaCodeBlock6081); 

                	newLeafNode(otherlv_1, grammarAccess.getScalaCodeBlockAccess().getLeftParenthesisKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2541:1: ( (lv_type_2_0= RULE_STRING ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2542:1: (lv_type_2_0= RULE_STRING )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2542:1: (lv_type_2_0= RULE_STRING )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2543:3: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScalaCodeBlock6098); 

            			newLeafNode(lv_type_2_0, grammarAccess.getScalaCodeBlockAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScalaCodeBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleScalaCodeBlock6115); 

                	newLeafNode(otherlv_3, grammarAccess.getScalaCodeBlockAccess().getRightParenthesisKeyword_3());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2563:1: ( (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2564:1: (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2564:1: (lv_codeStr_4_0= ruleSCALA_CODE_BLOCK )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2565:3: lv_codeStr_4_0= ruleSCALA_CODE_BLOCK
            {
             
            	        newCompositeNode(grammarAccess.getScalaCodeBlockAccess().getCodeStrSCALA_CODE_BLOCKParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSCALA_CODE_BLOCK_in_ruleScalaCodeBlock6136);
            lv_codeStr_4_0=ruleSCALA_CODE_BLOCK();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScalaCodeBlockRule());
            	        }
                   		set(
                   			current, 
                   			"codeStr",
                    		lv_codeStr_4_0, 
                    		"SCALA_CODE_BLOCK");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalaCodeBlock"


    // $ANTLR start "entryRuleKronusCodeBlock"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2589:1: entryRuleKronusCodeBlock returns [EObject current=null] : iv_ruleKronusCodeBlock= ruleKronusCodeBlock EOF ;
    public final EObject entryRuleKronusCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKronusCodeBlock = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2590:2: (iv_ruleKronusCodeBlock= ruleKronusCodeBlock EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2591:2: iv_ruleKronusCodeBlock= ruleKronusCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getKronusCodeBlockRule()); 
            pushFollow(FOLLOW_ruleKronusCodeBlock_in_entryRuleKronusCodeBlock6172);
            iv_ruleKronusCodeBlock=ruleKronusCodeBlock();

            state._fsp--;

             current =iv_ruleKronusCodeBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKronusCodeBlock6182); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKronusCodeBlock"


    // $ANTLR start "ruleKronusCodeBlock"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2598:1: ruleKronusCodeBlock returns [EObject current=null] : ( ( (lv_type_0_0= ruleKRONUSKW ) )? otherlv_1= '{' ( (lv_code_2_0= ruleKronus ) ) otherlv_3= '}' ) ;
    public final EObject ruleKronusCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_code_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2601:28: ( ( ( (lv_type_0_0= ruleKRONUSKW ) )? otherlv_1= '{' ( (lv_code_2_0= ruleKronus ) ) otherlv_3= '}' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2602:1: ( ( (lv_type_0_0= ruleKRONUSKW ) )? otherlv_1= '{' ( (lv_code_2_0= ruleKronus ) ) otherlv_3= '}' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2602:1: ( ( (lv_type_0_0= ruleKRONUSKW ) )? otherlv_1= '{' ( (lv_code_2_0= ruleKronus ) ) otherlv_3= '}' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2602:2: ( (lv_type_0_0= ruleKRONUSKW ) )? otherlv_1= '{' ( (lv_code_2_0= ruleKronus ) ) otherlv_3= '}'
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2602:2: ( (lv_type_0_0= ruleKRONUSKW ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2603:1: (lv_type_0_0= ruleKRONUSKW )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2603:1: (lv_type_0_0= ruleKRONUSKW )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2604:3: lv_type_0_0= ruleKRONUSKW
                    {
                     
                    	        newCompositeNode(grammarAccess.getKronusCodeBlockAccess().getTypeKRONUSKWParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKRONUSKW_in_ruleKronusCodeBlock6228);
                    lv_type_0_0=ruleKRONUSKW();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKronusCodeBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"KRONUSKW");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleKronusCodeBlock6241); 

                	newLeafNode(otherlv_1, grammarAccess.getKronusCodeBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2624:1: ( (lv_code_2_0= ruleKronus ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2625:1: (lv_code_2_0= ruleKronus )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2625:1: (lv_code_2_0= ruleKronus )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2626:3: lv_code_2_0= ruleKronus
            {
             
            	        newCompositeNode(grammarAccess.getKronusCodeBlockAccess().getCodeKronusParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleKronus_in_ruleKronusCodeBlock6262);
            lv_code_2_0=ruleKronus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKronusCodeBlockRule());
            	        }
                   		set(
                   			current, 
                   			"code",
                    		lv_code_2_0, 
                    		"Kronus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleKronusCodeBlock6274); 

                	newLeafNode(otherlv_3, grammarAccess.getKronusCodeBlockAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKronusCodeBlock"


    // $ANTLR start "entryRuleSimpleParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2654:1: entryRuleSimpleParameterValue returns [EObject current=null] : iv_ruleSimpleParameterValue= ruleSimpleParameterValue EOF ;
    public final EObject entryRuleSimpleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleParameterValue = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2655:2: (iv_ruleSimpleParameterValue= ruleSimpleParameterValue EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2656:2: iv_ruleSimpleParameterValue= ruleSimpleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getSimpleParameterValueRule()); 
            pushFollow(FOLLOW_ruleSimpleParameterValue_in_entryRuleSimpleParameterValue6310);
            iv_ruleSimpleParameterValue=ruleSimpleParameterValue();

            state._fsp--;

             current =iv_ruleSimpleParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleParameterValue6320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleParameterValue"


    // $ANTLR start "ruleSimpleParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2663:1: ruleSimpleParameterValue returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSimpleParameterValue() throws RecognitionException {
        EObject current = null;

        Token this_KRONUS_ASSIGN_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2666:28: ( ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2667:1: ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2667:1: ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= RULE_STRING ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2667:2: ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2667:2: ( (lv_name_0_0= ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2668:1: (lv_name_0_0= ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2668:1: (lv_name_0_0= ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2669:3: lv_name_0_0= ruleID
            {
             
            	        newCompositeNode(grammarAccess.getSimpleParameterValueAccess().getNameIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleSimpleParameterValue6366);
            lv_name_0_0=ruleID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleParameterValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_KRONUS_ASSIGN_1=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleSimpleParameterValue6377); 
             
                newLeafNode(this_KRONUS_ASSIGN_1, grammarAccess.getSimpleParameterValueAccess().getKRONUS_ASSIGNTerminalRuleCall_1()); 
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2689:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2690:1: (lv_value_2_0= RULE_STRING )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2690:1: (lv_value_2_0= RULE_STRING )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2691:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleParameterValue6393); 

            			newLeafNode(lv_value_2_0, grammarAccess.getSimpleParameterValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleParameterValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleParameterValue"


    // $ANTLR start "entryRuleHashtagCall"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2715:1: entryRuleHashtagCall returns [EObject current=null] : iv_ruleHashtagCall= ruleHashtagCall EOF ;
    public final EObject entryRuleHashtagCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashtagCall = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2716:2: (iv_ruleHashtagCall= ruleHashtagCall EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2717:2: iv_ruleHashtagCall= ruleHashtagCall EOF
            {
             newCompositeNode(grammarAccess.getHashtagCallRule()); 
            pushFollow(FOLLOW_ruleHashtagCall_in_entryRuleHashtagCall6434);
            iv_ruleHashtagCall=ruleHashtagCall();

            state._fsp--;

             current =iv_ruleHashtagCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashtagCall6444); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHashtagCall"


    // $ANTLR start "ruleHashtagCall"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2724:1: ruleHashtagCall returns [EObject current=null] : (otherlv_0= '#' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleHashtagCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterValues_3_0 = null;

        EObject lv_parameterValues_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2727:28: ( (otherlv_0= '#' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )* )? otherlv_6= ')' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2728:1: (otherlv_0= '#' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )* )? otherlv_6= ')' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2728:1: (otherlv_0= '#' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )* )? otherlv_6= ')' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2728:3: otherlv_0= '#' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleHashtagCall6481); 

                	newLeafNode(otherlv_0, grammarAccess.getHashtagCallAccess().getNumberSignKeyword_0());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2732:1: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2733:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2733:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2734:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getHashtagCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getHashtagCallAccess().getMethodHashtagDefCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleHashtagCall6504);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleHashtagCall6516); 

                	newLeafNode(otherlv_2, grammarAccess.getHashtagCallAccess().getLeftParenthesisKeyword_2());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2751:1: ( ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_CAPITALIZED_ID||LA44_0==RULE_OTHER_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2751:2: ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2751:2: ( (lv_parameterValues_3_0= ruleSimpleParameterValue ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2752:1: (lv_parameterValues_3_0= ruleSimpleParameterValue )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2752:1: (lv_parameterValues_3_0= ruleSimpleParameterValue )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2753:3: lv_parameterValues_3_0= ruleSimpleParameterValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getHashtagCallAccess().getParameterValuesSimpleParameterValueParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSimpleParameterValue_in_ruleHashtagCall6538);
                    lv_parameterValues_3_0=ruleSimpleParameterValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHashtagCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterValues",
                            		lv_parameterValues_3_0, 
                            		"SimpleParameterValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2769:2: (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2769:4: otherlv_4= ',' ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleHashtagCall6551); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getHashtagCallAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2773:1: ( (lv_parameterValues_5_0= ruleSimpleParameterValue ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2774:1: (lv_parameterValues_5_0= ruleSimpleParameterValue )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2774:1: (lv_parameterValues_5_0= ruleSimpleParameterValue )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2775:3: lv_parameterValues_5_0= ruleSimpleParameterValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHashtagCallAccess().getParameterValuesSimpleParameterValueParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSimpleParameterValue_in_ruleHashtagCall6572);
                    	    lv_parameterValues_5_0=ruleSimpleParameterValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHashtagCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterValues",
                    	            		lv_parameterValues_5_0, 
                    	            		"SimpleParameterValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleHashtagCall6588); 

                	newLeafNode(otherlv_6, grammarAccess.getHashtagCallAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHashtagCall"


    // $ANTLR start "entryRuleAnnotationCall"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2803:1: entryRuleAnnotationCall returns [EObject current=null] : iv_ruleAnnotationCall= ruleAnnotationCall EOF ;
    public final EObject entryRuleAnnotationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationCall = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2804:2: (iv_ruleAnnotationCall= ruleAnnotationCall EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2805:2: iv_ruleAnnotationCall= ruleAnnotationCall EOF
            {
             newCompositeNode(grammarAccess.getAnnotationCallRule()); 
            pushFollow(FOLLOW_ruleAnnotationCall_in_entryRuleAnnotationCall6624);
            iv_ruleAnnotationCall=ruleAnnotationCall();

            state._fsp--;

             current =iv_ruleAnnotationCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationCall6634); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationCall"


    // $ANTLR start "ruleAnnotationCall"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2812:1: ruleAnnotationCall returns [EObject current=null] : (otherlv_0= '@' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleAnnotationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterValues_3_0 = null;

        EObject lv_parameterValues_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2815:28: ( (otherlv_0= '@' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )* )? otherlv_6= ')' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2816:1: (otherlv_0= '@' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )* )? otherlv_6= ')' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2816:1: (otherlv_0= '@' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )* )? otherlv_6= ')' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2816:3: otherlv_0= '@' ( ( ruleID ) ) otherlv_2= '(' ( ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleAnnotationCall6671); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationCallAccess().getCommercialAtKeyword_0());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2820:1: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2821:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2821:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2822:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAnnotationCallAccess().getMethodAnnotationDefCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleAnnotationCall6694);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleAnnotationCall6706); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationCallAccess().getLeftParenthesisKeyword_2());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2839:1: ( ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_CAPITALIZED_ID||(LA46_0>=RULE_STRING && LA46_0<=RULE_INT)||LA46_0==RULE_OTHER_ID||LA46_0==15||(LA46_0>=21 && LA46_0<=22)||LA46_0==25||LA46_0==28||LA46_0==33||LA46_0==35||LA46_0==38||LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2839:2: ( (lv_parameterValues_3_0= ruleParameterValue ) ) (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2839:2: ( (lv_parameterValues_3_0= ruleParameterValue ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2840:1: (lv_parameterValues_3_0= ruleParameterValue )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2840:1: (lv_parameterValues_3_0= ruleParameterValue )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2841:3: lv_parameterValues_3_0= ruleParameterValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnnotationCallAccess().getParameterValuesParameterValueParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterValue_in_ruleAnnotationCall6728);
                    lv_parameterValues_3_0=ruleParameterValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnnotationCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterValues",
                            		lv_parameterValues_3_0, 
                            		"ParameterValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2857:2: (otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==16) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2857:4: otherlv_4= ',' ( (lv_parameterValues_5_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAnnotationCall6741); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnnotationCallAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2861:1: ( (lv_parameterValues_5_0= ruleParameterValue ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2862:1: (lv_parameterValues_5_0= ruleParameterValue )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2862:1: (lv_parameterValues_5_0= ruleParameterValue )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2863:3: lv_parameterValues_5_0= ruleParameterValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnnotationCallAccess().getParameterValuesParameterValueParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterValue_in_ruleAnnotationCall6762);
                    	    lv_parameterValues_5_0=ruleParameterValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnnotationCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterValues",
                    	            		lv_parameterValues_5_0, 
                    	            		"ParameterValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleAnnotationCall6778); 

                	newLeafNode(otherlv_6, grammarAccess.getAnnotationCallAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationCall"


    // $ANTLR start "entryRuleParameterDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2891:1: entryRuleParameterDef returns [EObject current=null] : iv_ruleParameterDef= ruleParameterDef EOF ;
    public final EObject entryRuleParameterDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2892:2: (iv_ruleParameterDef= ruleParameterDef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2893:2: iv_ruleParameterDef= ruleParameterDef EOF
            {
             newCompositeNode(grammarAccess.getParameterDefRule()); 
            pushFollow(FOLLOW_ruleParameterDef_in_entryRuleParameterDef6814);
            iv_ruleParameterDef=ruleParameterDef();

            state._fsp--;

             current =iv_ruleParameterDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDef6824); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDef"


    // $ANTLR start "ruleParameterDef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2900:1: ruleParameterDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= ':' ( (lv_byName_2_0= '=>' ) )? ( (lv_type_3_0= ruleTypeInstance ) ) ( (lv_list_4_0= '*' ) )? (this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) ) )? ) ;
    public final EObject ruleParameterDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_byName_2_0=null;
        Token lv_list_4_0=null;
        Token this_KRONUS_ASSIGN_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_defaultValue_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2903:28: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= ':' ( (lv_byName_2_0= '=>' ) )? ( (lv_type_3_0= ruleTypeInstance ) ) ( (lv_list_4_0= '*' ) )? (this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) ) )? ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2904:1: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= ':' ( (lv_byName_2_0= '=>' ) )? ( (lv_type_3_0= ruleTypeInstance ) ) ( (lv_list_4_0= '*' ) )? (this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) ) )? )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2904:1: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= ':' ( (lv_byName_2_0= '=>' ) )? ( (lv_type_3_0= ruleTypeInstance ) ) ( (lv_list_4_0= '*' ) )? (this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) ) )? )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2904:2: ( (lv_name_0_0= ruleID ) ) otherlv_1= ':' ( (lv_byName_2_0= '=>' ) )? ( (lv_type_3_0= ruleTypeInstance ) ) ( (lv_list_4_0= '*' ) )? (this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) ) )?
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2904:2: ( (lv_name_0_0= ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2905:1: (lv_name_0_0= ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2905:1: (lv_name_0_0= ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2906:3: lv_name_0_0= ruleID
            {
             
            	        newCompositeNode(grammarAccess.getParameterDefAccess().getNameIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleParameterDef6870);
            lv_name_0_0=ruleID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterDefRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleParameterDef6882); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterDefAccess().getColonKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2926:1: ( (lv_byName_2_0= '=>' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2927:1: (lv_byName_2_0= '=>' )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2927:1: (lv_byName_2_0= '=>' )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2928:3: lv_byName_2_0= '=>'
                    {
                    lv_byName_2_0=(Token)match(input,18,FOLLOW_18_in_ruleParameterDef6900); 

                            newLeafNode(lv_byName_2_0, grammarAccess.getParameterDefAccess().getByNameEqualsSignGreaterThanSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDefRule());
                    	        }
                           		setWithLastConsumed(current, "byName", true, "=>");
                    	    

                    }


                    }
                    break;

            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2941:3: ( (lv_type_3_0= ruleTypeInstance ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2942:1: (lv_type_3_0= ruleTypeInstance )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2942:1: (lv_type_3_0= ruleTypeInstance )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2943:3: lv_type_3_0= ruleTypeInstance
            {
             
            	        newCompositeNode(grammarAccess.getParameterDefAccess().getTypeTypeInstanceParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeInstance_in_ruleParameterDef6935);
            lv_type_3_0=ruleTypeInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterDefRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2959:2: ( (lv_list_4_0= '*' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2960:1: (lv_list_4_0= '*' )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2960:1: (lv_list_4_0= '*' )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2961:3: lv_list_4_0= '*'
                    {
                    lv_list_4_0=(Token)match(input,43,FOLLOW_43_in_ruleParameterDef6953); 

                            newLeafNode(lv_list_4_0, grammarAccess.getParameterDefAccess().getListAsteriskKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDefRule());
                    	        }
                           		setWithLastConsumed(current, "list", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2974:3: (this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_KRONUS_ASSIGN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2974:4: this_KRONUS_ASSIGN_5= RULE_KRONUS_ASSIGN ( (lv_defaultValue_6_0= ruleValueOperation ) )
                    {
                    this_KRONUS_ASSIGN_5=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleParameterDef6979); 
                     
                        newLeafNode(this_KRONUS_ASSIGN_5, grammarAccess.getParameterDefAccess().getKRONUS_ASSIGNTerminalRuleCall_5_0()); 
                        
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2978:1: ( (lv_defaultValue_6_0= ruleValueOperation ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2979:1: (lv_defaultValue_6_0= ruleValueOperation )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2979:1: (lv_defaultValue_6_0= ruleValueOperation )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:2980:3: lv_defaultValue_6_0= ruleValueOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterDefAccess().getDefaultValueValueOperationParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueOperation_in_ruleParameterDef6999);
                    lv_defaultValue_6_0=ruleValueOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterDefRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultValue",
                            		lv_defaultValue_6_0, 
                            		"ValueOperation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDef"


    // $ANTLR start "entryRuleParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3004:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3005:2: (iv_ruleParameterValue= ruleParameterValue EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3006:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_ruleParameterValue_in_entryRuleParameterValue7037);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValue7047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3013:1: ruleParameterValue returns [EObject current=null] : (this_KeywordParameterValue_0= ruleKeywordParameterValue | this_PositionParameterValue_1= rulePositionParameterValue ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_KeywordParameterValue_0 = null;

        EObject this_PositionParameterValue_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3016:28: ( (this_KeywordParameterValue_0= ruleKeywordParameterValue | this_PositionParameterValue_1= rulePositionParameterValue ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3017:1: (this_KeywordParameterValue_0= ruleKeywordParameterValue | this_PositionParameterValue_1= rulePositionParameterValue )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3017:1: (this_KeywordParameterValue_0= ruleKeywordParameterValue | this_PositionParameterValue_1= rulePositionParameterValue )
            int alt50=2;
            switch ( input.LA(1) ) {
            case RULE_CAPITALIZED_ID:
                {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==EOF||LA50_1==13||LA50_1==16||(LA50_1>=32 && LA50_1<=33)||(LA50_1>=38 && LA50_1<=39)||LA50_1==43||(LA50_1>=45 && LA50_1<=53)) ) {
                    alt50=2;
                }
                else if ( (LA50_1==RULE_KRONUS_ASSIGN) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OTHER_ID:
                {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==RULE_KRONUS_ASSIGN) ) {
                    alt50=1;
                }
                else if ( (LA50_2==EOF||LA50_2==13||LA50_2==16||(LA50_2>=32 && LA50_2<=33)||(LA50_2>=38 && LA50_2<=39)||LA50_2==43||(LA50_2>=45 && LA50_2<=53)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 15:
            case 21:
            case 22:
            case 25:
            case 28:
            case 33:
            case 35:
            case 38:
            case 44:
                {
                alt50=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3018:5: this_KeywordParameterValue_0= ruleKeywordParameterValue
                    {
                     
                            newCompositeNode(grammarAccess.getParameterValueAccess().getKeywordParameterValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKeywordParameterValue_in_ruleParameterValue7094);
                    this_KeywordParameterValue_0=ruleKeywordParameterValue();

                    state._fsp--;

                     
                            current = this_KeywordParameterValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3028:5: this_PositionParameterValue_1= rulePositionParameterValue
                    {
                     
                            newCompositeNode(grammarAccess.getParameterValueAccess().getPositionParameterValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePositionParameterValue_in_ruleParameterValue7121);
                    this_PositionParameterValue_1=rulePositionParameterValue();

                    state._fsp--;

                     
                            current = this_PositionParameterValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleKeywordParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3044:1: entryRuleKeywordParameterValue returns [EObject current=null] : iv_ruleKeywordParameterValue= ruleKeywordParameterValue EOF ;
    public final EObject entryRuleKeywordParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeywordParameterValue = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3045:2: (iv_ruleKeywordParameterValue= ruleKeywordParameterValue EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3046:2: iv_ruleKeywordParameterValue= ruleKeywordParameterValue EOF
            {
             newCompositeNode(grammarAccess.getKeywordParameterValueRule()); 
            pushFollow(FOLLOW_ruleKeywordParameterValue_in_entryRuleKeywordParameterValue7156);
            iv_ruleKeywordParameterValue=ruleKeywordParameterValue();

            state._fsp--;

             current =iv_ruleKeywordParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeywordParameterValue7166); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeywordParameterValue"


    // $ANTLR start "ruleKeywordParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3053:1: ruleKeywordParameterValue returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= ruleValueOperation ) ) ) ;
    public final EObject ruleKeywordParameterValue() throws RecognitionException {
        EObject current = null;

        Token this_KRONUS_ASSIGN_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3056:28: ( ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= ruleValueOperation ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3057:1: ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= ruleValueOperation ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3057:1: ( ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= ruleValueOperation ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3057:2: ( (lv_name_0_0= ruleID ) ) this_KRONUS_ASSIGN_1= RULE_KRONUS_ASSIGN ( (lv_value_2_0= ruleValueOperation ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3057:2: ( (lv_name_0_0= ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3058:1: (lv_name_0_0= ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3058:1: (lv_name_0_0= ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3059:3: lv_name_0_0= ruleID
            {
             
            	        newCompositeNode(grammarAccess.getKeywordParameterValueAccess().getNameIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleKeywordParameterValue7212);
            lv_name_0_0=ruleID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeywordParameterValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_KRONUS_ASSIGN_1=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleKeywordParameterValue7223); 
             
                newLeafNode(this_KRONUS_ASSIGN_1, grammarAccess.getKeywordParameterValueAccess().getKRONUS_ASSIGNTerminalRuleCall_1()); 
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3079:1: ( (lv_value_2_0= ruleValueOperation ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3080:1: (lv_value_2_0= ruleValueOperation )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3080:1: (lv_value_2_0= ruleValueOperation )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3081:3: lv_value_2_0= ruleValueOperation
            {
             
            	        newCompositeNode(grammarAccess.getKeywordParameterValueAccess().getValueValueOperationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValueOperation_in_ruleKeywordParameterValue7243);
            lv_value_2_0=ruleValueOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeywordParameterValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ValueOperation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeywordParameterValue"


    // $ANTLR start "entryRulePositionParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3105:1: entryRulePositionParameterValue returns [EObject current=null] : iv_rulePositionParameterValue= rulePositionParameterValue EOF ;
    public final EObject entryRulePositionParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionParameterValue = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3106:2: (iv_rulePositionParameterValue= rulePositionParameterValue EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3107:2: iv_rulePositionParameterValue= rulePositionParameterValue EOF
            {
             newCompositeNode(grammarAccess.getPositionParameterValueRule()); 
            pushFollow(FOLLOW_rulePositionParameterValue_in_entryRulePositionParameterValue7279);
            iv_rulePositionParameterValue=rulePositionParameterValue();

            state._fsp--;

             current =iv_rulePositionParameterValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePositionParameterValue7289); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePositionParameterValue"


    // $ANTLR start "rulePositionParameterValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3114:1: rulePositionParameterValue returns [EObject current=null] : ( (lv_value_0_0= ruleValueOperation ) ) ;
    public final EObject rulePositionParameterValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3117:28: ( ( (lv_value_0_0= ruleValueOperation ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3118:1: ( (lv_value_0_0= ruleValueOperation ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3118:1: ( (lv_value_0_0= ruleValueOperation ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3119:1: (lv_value_0_0= ruleValueOperation )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3119:1: (lv_value_0_0= ruleValueOperation )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3120:3: lv_value_0_0= ruleValueOperation
            {
             
            	        newCompositeNode(grammarAccess.getPositionParameterValueAccess().getValueValueOperationParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleValueOperation_in_rulePositionParameterValue7334);
            lv_value_0_0=ruleValueOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPositionParameterValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ValueOperation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePositionParameterValue"


    // $ANTLR start "entryRulePrimary"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3144:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3145:2: (iv_rulePrimary= rulePrimary EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3146:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary7369);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary7379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3153:1: rulePrimary returns [EObject current=null] : (this_Value_0= ruleValue | (otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Value_0 = null;

        EObject this_ValueOperation_2 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3156:28: ( (this_Value_0= ruleValue | (otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')' ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3157:1: (this_Value_0= ruleValue | (otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')' ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3157:1: (this_Value_0= ruleValue | (otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_CAPITALIZED_ID||(LA51_0>=RULE_STRING && LA51_0<=RULE_INT)||LA51_0==RULE_OTHER_ID||LA51_0==15||(LA51_0>=21 && LA51_0<=22)||LA51_0==25||LA51_0==28||LA51_0==35) ) {
                alt51=1;
            }
            else if ( (LA51_0==38) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3158:5: this_Value_0= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_rulePrimary7426);
                    this_Value_0=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3167:6: (otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')' )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3167:6: (otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')' )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3167:8: otherlv_1= '(' this_ValueOperation_2= ruleValueOperation otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_38_in_rulePrimary7444); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getValueOperationParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleValueOperation_in_rulePrimary7466);
                    this_ValueOperation_2=ruleValueOperation();

                    state._fsp--;

                     
                            current = this_ValueOperation_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_rulePrimary7477); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3192:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3193:2: (iv_ruleValue= ruleValue EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3194:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue7514);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue7524); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3201:1: ruleValue returns [EObject current=null] : (this_Sequence_0= ruleSequence | this_ValRef_1= ruleValRef | this_FunctionCall_2= ruleFunctionCall | this_IncludeRef_3= ruleIncludeRef | this_StringLiteral_4= ruleStringLiteral | this_DoubleLiteral_5= ruleDoubleLiteral | this_IntegerLiteral_6= ruleIntegerLiteral | this_BooleanLiteral_7= ruleBooleanLiteral | this_CodeBlock_8= ruleCodeBlock ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Sequence_0 = null;

        EObject this_ValRef_1 = null;

        EObject this_FunctionCall_2 = null;

        EObject this_IncludeRef_3 = null;

        EObject this_StringLiteral_4 = null;

        EObject this_DoubleLiteral_5 = null;

        EObject this_IntegerLiteral_6 = null;

        EObject this_BooleanLiteral_7 = null;

        EObject this_CodeBlock_8 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3204:28: ( (this_Sequence_0= ruleSequence | this_ValRef_1= ruleValRef | this_FunctionCall_2= ruleFunctionCall | this_IncludeRef_3= ruleIncludeRef | this_StringLiteral_4= ruleStringLiteral | this_DoubleLiteral_5= ruleDoubleLiteral | this_IntegerLiteral_6= ruleIntegerLiteral | this_BooleanLiteral_7= ruleBooleanLiteral | this_CodeBlock_8= ruleCodeBlock ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3205:1: (this_Sequence_0= ruleSequence | this_ValRef_1= ruleValRef | this_FunctionCall_2= ruleFunctionCall | this_IncludeRef_3= ruleIncludeRef | this_StringLiteral_4= ruleStringLiteral | this_DoubleLiteral_5= ruleDoubleLiteral | this_IntegerLiteral_6= ruleIntegerLiteral | this_BooleanLiteral_7= ruleBooleanLiteral | this_CodeBlock_8= ruleCodeBlock )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3205:1: (this_Sequence_0= ruleSequence | this_ValRef_1= ruleValRef | this_FunctionCall_2= ruleFunctionCall | this_IncludeRef_3= ruleIncludeRef | this_StringLiteral_4= ruleStringLiteral | this_DoubleLiteral_5= ruleDoubleLiteral | this_IntegerLiteral_6= ruleIntegerLiteral | this_BooleanLiteral_7= ruleBooleanLiteral | this_CodeBlock_8= ruleCodeBlock )
            int alt52=9;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3206:5: this_Sequence_0= ruleSequence
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getSequenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSequence_in_ruleValue7571);
                    this_Sequence_0=ruleSequence();

                    state._fsp--;

                     
                            current = this_Sequence_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3216:5: this_ValRef_1= ruleValRef
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getValRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleValRef_in_ruleValue7598);
                    this_ValRef_1=ruleValRef();

                    state._fsp--;

                     
                            current = this_ValRef_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3226:5: this_FunctionCall_2= ruleFunctionCall
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getFunctionCallParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleValue7625);
                    this_FunctionCall_2=ruleFunctionCall();

                    state._fsp--;

                     
                            current = this_FunctionCall_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3236:5: this_IncludeRef_3= ruleIncludeRef
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIncludeRefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIncludeRef_in_ruleValue7652);
                    this_IncludeRef_3=ruleIncludeRef();

                    state._fsp--;

                     
                            current = this_IncludeRef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3246:5: this_StringLiteral_4= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValue7679);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3256:5: this_DoubleLiteral_5= ruleDoubleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDoubleLiteralParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleDoubleLiteral_in_ruleValue7706);
                    this_DoubleLiteral_5=ruleDoubleLiteral();

                    state._fsp--;

                     
                            current = this_DoubleLiteral_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3266:5: this_IntegerLiteral_6= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleValue7733);
                    this_IntegerLiteral_6=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3276:5: this_BooleanLiteral_7= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleValue7760);
                    this_BooleanLiteral_7=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3286:5: this_CodeBlock_8= ruleCodeBlock
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getCodeBlockParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleCodeBlock_in_ruleValue7787);
                    this_CodeBlock_8=ruleCodeBlock();

                    state._fsp--;

                     
                            current = this_CodeBlock_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleSequence"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3302:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3303:2: (iv_ruleSequence= ruleSequence EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3304:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence7822);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence7832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3311:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3314:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )* )? otherlv_5= ']' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3315:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )* )? otherlv_5= ']' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3315:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )* )? otherlv_5= ']' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3315:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )* )? otherlv_5= ']'
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3315:2: ()
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3316:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceAccess().getSequenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSequence7878); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3325:1: ( ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_CAPITALIZED_ID||(LA54_0>=RULE_STRING && LA54_0<=RULE_INT)||LA54_0==RULE_OTHER_ID||LA54_0==15||(LA54_0>=21 && LA54_0<=22)||LA54_0==25||LA54_0==28||LA54_0==33||LA54_0==35||LA54_0==38||LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3325:2: ( (lv_values_2_0= ruleValueOperation ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3325:2: ( (lv_values_2_0= ruleValueOperation ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3326:1: (lv_values_2_0= ruleValueOperation )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3326:1: (lv_values_2_0= ruleValueOperation )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3327:3: lv_values_2_0= ruleValueOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getValuesValueOperationParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueOperation_in_ruleSequence7900);
                    lv_values_2_0=ruleValueOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_2_0, 
                            		"ValueOperation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3343:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==16) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3343:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueOperation ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSequence7913); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3347:1: ( (lv_values_4_0= ruleValueOperation ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3348:1: (lv_values_4_0= ruleValueOperation )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3348:1: (lv_values_4_0= ruleValueOperation )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3349:3: lv_values_4_0= ruleValueOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSequenceAccess().getValuesValueOperationParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueOperation_in_ruleSequence7934);
                    	    lv_values_4_0=ruleValueOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_4_0, 
                    	            		"ValueOperation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleSequence7950); 

                	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleValRef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3377:1: entryRuleValRef returns [EObject current=null] : iv_ruleValRef= ruleValRef EOF ;
    public final EObject entryRuleValRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValRef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3378:2: (iv_ruleValRef= ruleValRef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3379:2: iv_ruleValRef= ruleValRef EOF
            {
             newCompositeNode(grammarAccess.getValRefRule()); 
            pushFollow(FOLLOW_ruleValRef_in_entryRuleValRef7986);
            iv_ruleValRef=ruleValRef();

            state._fsp--;

             current =iv_ruleValRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValRef7996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValRef"


    // $ANTLR start "ruleValRef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3386:1: ruleValRef returns [EObject current=null] : ( ( ruleID ) ) ;
    public final EObject ruleValRef() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3389:28: ( ( ( ruleID ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3390:1: ( ( ruleID ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3390:1: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3391:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3391:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3392:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getValRefAccess().getRefReferenceableDefsCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleValRef8043);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValRef"


    // $ANTLR start "entryRuleFunctionCall"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3413:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3414:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3415:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall8078);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall8088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3422:1: ruleFunctionCall returns [EObject current=null] : ( ( ( ruleID ) ) otherlv_1= '(' ( ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterValues_2_0 = null;

        EObject lv_parameterValues_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3425:28: ( ( ( ( ruleID ) ) otherlv_1= '(' ( ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )* )? otherlv_5= ')' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3426:1: ( ( ( ruleID ) ) otherlv_1= '(' ( ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )* )? otherlv_5= ')' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3426:1: ( ( ( ruleID ) ) otherlv_1= '(' ( ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )* )? otherlv_5= ')' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3426:2: ( ( ruleID ) ) otherlv_1= '(' ( ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )* )? otherlv_5= ')'
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3426:2: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3427:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3427:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3428:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getMethodFunctionDefCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleFunctionCall8136);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleFunctionCall8148); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3445:1: ( ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_CAPITALIZED_ID||(LA56_0>=RULE_STRING && LA56_0<=RULE_INT)||LA56_0==RULE_OTHER_ID||LA56_0==15||(LA56_0>=21 && LA56_0<=22)||LA56_0==25||LA56_0==28||LA56_0==33||LA56_0==35||LA56_0==38||LA56_0==44) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3445:2: ( (lv_parameterValues_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )*
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3445:2: ( (lv_parameterValues_2_0= ruleParameterValue ) )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3446:1: (lv_parameterValues_2_0= ruleParameterValue )
                    {
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3446:1: (lv_parameterValues_2_0= ruleParameterValue )
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3447:3: lv_parameterValues_2_0= ruleParameterValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParameterValuesParameterValueParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterValue_in_ruleFunctionCall8170);
                    lv_parameterValues_2_0=ruleParameterValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterValues",
                            		lv_parameterValues_2_0, 
                            		"ParameterValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3463:2: (otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==16) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3463:4: otherlv_3= ',' ( (lv_parameterValues_4_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFunctionCall8183); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3467:1: ( (lv_parameterValues_4_0= ruleParameterValue ) )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3468:1: (lv_parameterValues_4_0= ruleParameterValue )
                    	    {
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3468:1: (lv_parameterValues_4_0= ruleParameterValue )
                    	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3469:3: lv_parameterValues_4_0= ruleParameterValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParameterValuesParameterValueParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameterValue_in_ruleFunctionCall8204);
                    	    lv_parameterValues_4_0=ruleParameterValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterValues",
                    	            		lv_parameterValues_4_0, 
                    	            		"ParameterValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleFunctionCall8220); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleIncludeRef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3497:1: entryRuleIncludeRef returns [EObject current=null] : iv_ruleIncludeRef= ruleIncludeRef EOF ;
    public final EObject entryRuleIncludeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeRef = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3498:2: (iv_ruleIncludeRef= ruleIncludeRef EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3499:2: iv_ruleIncludeRef= ruleIncludeRef EOF
            {
             newCompositeNode(grammarAccess.getIncludeRefRule()); 
            pushFollow(FOLLOW_ruleIncludeRef_in_entryRuleIncludeRef8256);
            iv_ruleIncludeRef=ruleIncludeRef();

            state._fsp--;

             current =iv_ruleIncludeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeRef8266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeRef"


    // $ANTLR start "ruleIncludeRef"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3506:1: ruleIncludeRef returns [EObject current=null] : ( ( ( ruleID ) ) otherlv_1= '.' ( ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) ) ) ) ;
    public final EObject ruleIncludeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ref_2_1 = null;

        EObject lv_ref_2_2 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3509:28: ( ( ( ( ruleID ) ) otherlv_1= '.' ( ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3510:1: ( ( ( ruleID ) ) otherlv_1= '.' ( ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3510:1: ( ( ( ruleID ) ) otherlv_1= '.' ( ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3510:2: ( ( ruleID ) ) otherlv_1= '.' ( ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3510:2: ( ( ruleID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3511:1: ( ruleID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3511:1: ( ruleID )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3512:3: ruleID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeRefAccess().getIncludeIncludeDefCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleIncludeRef8314);
            ruleID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleIncludeRef8326); 

                	newLeafNode(otherlv_1, grammarAccess.getIncludeRefAccess().getFullStopKeyword_1());
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3529:1: ( ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3530:1: ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3530:1: ( (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3531:1: (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3531:1: (lv_ref_2_1= ruleValRef | lv_ref_2_2= ruleFunctionCall )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_CAPITALIZED_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==38) ) {
                    alt57=2;
                }
                else if ( (LA57_1==EOF||(LA57_1>=16 && LA57_1<=17)||LA57_1==20||LA57_1==27||(LA57_1>=29 && LA57_1<=30)||(LA57_1>=32 && LA57_1<=33)||LA57_1==36||LA57_1==39||(LA57_1>=41 && LA57_1<=43)||(LA57_1>=45 && LA57_1<=53)) ) {
                    alt57=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA57_0==RULE_OTHER_ID) ) {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==38) ) {
                    alt57=2;
                }
                else if ( (LA57_2==EOF||(LA57_2>=16 && LA57_2<=17)||LA57_2==20||LA57_2==27||(LA57_2>=29 && LA57_2<=30)||(LA57_2>=32 && LA57_2<=33)||LA57_2==36||LA57_2==39||(LA57_2>=41 && LA57_2<=43)||(LA57_2>=45 && LA57_2<=53)) ) {
                    alt57=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3532:3: lv_ref_2_1= ruleValRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludeRefAccess().getRefValRefParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValRef_in_ruleIncludeRef8349);
                    lv_ref_2_1=ruleValRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIncludeRefRule());
                    	        }
                           		set(
                           			current, 
                           			"ref",
                            		lv_ref_2_1, 
                            		"ValRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3547:8: lv_ref_2_2= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getIncludeRefAccess().getRefFunctionCallParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleIncludeRef8368);
                    lv_ref_2_2=ruleFunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIncludeRefRule());
                    	        }
                           		set(
                           			current, 
                           			"ref",
                            		lv_ref_2_2, 
                            		"FunctionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeRef"


    // $ANTLR start "entryRuleStringLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3573:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3574:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3575:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8407);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral8417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3582:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3585:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3586:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3586:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3587:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3587:1: (lv_value_0_0= RULE_STRING )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3588:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral8458); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleDoubleLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3612:1: entryRuleDoubleLiteral returns [EObject current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final EObject entryRuleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleLiteral = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3613:2: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3614:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral8498);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleLiteral8508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3621:1: ruleDoubleLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleDOUBLE ) ) ;
    public final EObject ruleDoubleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3624:28: ( ( (lv_value_0_0= ruleDOUBLE ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3625:1: ( (lv_value_0_0= ruleDOUBLE ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3625:1: ( (lv_value_0_0= ruleDOUBLE ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3626:1: (lv_value_0_0= ruleDOUBLE )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3626:1: (lv_value_0_0= ruleDOUBLE )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3627:3: lv_value_0_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getDoubleLiteralAccess().getValueDOUBLEParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleDoubleLiteral8553);
            lv_value_0_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoubleLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3651:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3652:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3653:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral8588);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral8598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3660:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3663:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3664:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3664:1: ( (lv_value_0_0= RULE_INT ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3665:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3665:1: (lv_value_0_0= RULE_INT )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3666:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral8639); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntegerLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3690:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3691:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3692:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8679);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3699:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3702:28: ( ( (lv_value_0_0= ruleBOOLEAN ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3703:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3703:1: ( (lv_value_0_0= ruleBOOLEAN ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3704:1: (lv_value_0_0= ruleBOOLEAN )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3704:1: (lv_value_0_0= ruleBOOLEAN )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3705:3: lv_value_0_0= ruleBOOLEAN
            {
             
            	        newCompositeNode(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral8734);
            lv_value_0_0=ruleBOOLEAN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BOOLEAN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3729:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3730:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3731:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation8769);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation8779); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3738:1: ruleUnaryOperation returns [EObject current=null] : ( () ( (lv_op_1_0= ruleUNARY_OPS ) ) ( (lv_expr_2_0= ruleUnaryOrPrimary ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3741:28: ( ( () ( (lv_op_1_0= ruleUNARY_OPS ) ) ( (lv_expr_2_0= ruleUnaryOrPrimary ) ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3742:1: ( () ( (lv_op_1_0= ruleUNARY_OPS ) ) ( (lv_expr_2_0= ruleUnaryOrPrimary ) ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3742:1: ( () ( (lv_op_1_0= ruleUNARY_OPS ) ) ( (lv_expr_2_0= ruleUnaryOrPrimary ) ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3742:2: () ( (lv_op_1_0= ruleUNARY_OPS ) ) ( (lv_expr_2_0= ruleUnaryOrPrimary ) )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3742:2: ()
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3743:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnaryOperationAccess().getUnaryOperationAction_0(),
                        current);
                

            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3748:2: ( (lv_op_1_0= ruleUNARY_OPS ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3749:1: (lv_op_1_0= ruleUNARY_OPS )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3749:1: (lv_op_1_0= ruleUNARY_OPS )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3750:3: lv_op_1_0= ruleUNARY_OPS
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOpUNARY_OPSParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUNARY_OPS_in_ruleUnaryOperation8834);
            lv_op_1_0=ruleUNARY_OPS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"UNARY_OPS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3766:2: ( (lv_expr_2_0= ruleUnaryOrPrimary ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3767:1: (lv_expr_2_0= ruleUnaryOrPrimary )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3767:1: (lv_expr_2_0= ruleUnaryOrPrimary )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3768:3: lv_expr_2_0= ruleUnaryOrPrimary
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExprUnaryOrPrimaryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryOrPrimary_in_ruleUnaryOperation8855);
            lv_expr_2_0=ruleUnaryOrPrimary();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"UnaryOrPrimary");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleUnaryOrPrimary"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3792:1: entryRuleUnaryOrPrimary returns [EObject current=null] : iv_ruleUnaryOrPrimary= ruleUnaryOrPrimary EOF ;
    public final EObject entryRuleUnaryOrPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrPrimary = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3793:2: (iv_ruleUnaryOrPrimary= ruleUnaryOrPrimary EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3794:2: iv_ruleUnaryOrPrimary= ruleUnaryOrPrimary EOF
            {
             newCompositeNode(grammarAccess.getUnaryOrPrimaryRule()); 
            pushFollow(FOLLOW_ruleUnaryOrPrimary_in_entryRuleUnaryOrPrimary8891);
            iv_ruleUnaryOrPrimary=ruleUnaryOrPrimary();

            state._fsp--;

             current =iv_ruleUnaryOrPrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrPrimary8901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOrPrimary"


    // $ANTLR start "ruleUnaryOrPrimary"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3801:1: ruleUnaryOrPrimary returns [EObject current=null] : (this_Primary_0= rulePrimary | this_UnaryOperation_1= ruleUnaryOperation ) ;
    public final EObject ruleUnaryOrPrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject this_UnaryOperation_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3804:28: ( (this_Primary_0= rulePrimary | this_UnaryOperation_1= ruleUnaryOperation ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3805:1: (this_Primary_0= rulePrimary | this_UnaryOperation_1= ruleUnaryOperation )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3805:1: (this_Primary_0= rulePrimary | this_UnaryOperation_1= ruleUnaryOperation )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_CAPITALIZED_ID||(LA58_0>=RULE_STRING && LA58_0<=RULE_INT)||LA58_0==RULE_OTHER_ID||LA58_0==15||(LA58_0>=21 && LA58_0<=22)||LA58_0==25||LA58_0==28||LA58_0==35||LA58_0==38) ) {
                alt58=1;
            }
            else if ( (LA58_0==33||LA58_0==44) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3806:5: this_Primary_0= rulePrimary
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryOrPrimaryAccess().getPrimaryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimary_in_ruleUnaryOrPrimary8948);
                    this_Primary_0=rulePrimary();

                    state._fsp--;

                     
                            current = this_Primary_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3816:5: this_UnaryOperation_1= ruleUnaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryOrPrimaryAccess().getUnaryOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOrPrimary8975);
                    this_UnaryOperation_1=ruleUnaryOperation();

                    state._fsp--;

                     
                            current = this_UnaryOperation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOrPrimary"


    // $ANTLR start "entryRuleBinaryOperation1"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3832:1: entryRuleBinaryOperation1 returns [EObject current=null] : iv_ruleBinaryOperation1= ruleBinaryOperation1 EOF ;
    public final EObject entryRuleBinaryOperation1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation1 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3833:2: (iv_ruleBinaryOperation1= ruleBinaryOperation1 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3834:2: iv_ruleBinaryOperation1= ruleBinaryOperation1 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperation1Rule()); 
            pushFollow(FOLLOW_ruleBinaryOperation1_in_entryRuleBinaryOperation19010);
            iv_ruleBinaryOperation1=ruleBinaryOperation1();

            state._fsp--;

             current =iv_ruleBinaryOperation1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperation19020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperation1"


    // $ANTLR start "ruleBinaryOperation1"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3841:1: ruleBinaryOperation1 returns [EObject current=null] : (this_UnaryOrPrimary_0= ruleUnaryOrPrimary ( () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) ) )* ) ;
    public final EObject ruleBinaryOperation1() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrPrimary_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3844:28: ( (this_UnaryOrPrimary_0= ruleUnaryOrPrimary ( () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3845:1: (this_UnaryOrPrimary_0= ruleUnaryOrPrimary ( () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3845:1: (this_UnaryOrPrimary_0= ruleUnaryOrPrimary ( () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3846:5: this_UnaryOrPrimary_0= ruleUnaryOrPrimary ( () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperation1Access().getUnaryOrPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnaryOrPrimary_in_ruleBinaryOperation19067);
            this_UnaryOrPrimary_0=ruleUnaryOrPrimary();

            state._fsp--;

             
                    current = this_UnaryOrPrimary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3854:1: ( () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==43||LA59_0==45) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3854:2: () ( (lv_op_2_0= ruleBINARY_OPS_1 ) ) ( (lv_right_3_0= ruleUnaryOrPrimary ) )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3854:2: ()
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3855:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperation1Access().getBinaryOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3860:2: ( (lv_op_2_0= ruleBINARY_OPS_1 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3861:1: (lv_op_2_0= ruleBINARY_OPS_1 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3861:1: (lv_op_2_0= ruleBINARY_OPS_1 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3862:3: lv_op_2_0= ruleBINARY_OPS_1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation1Access().getOpBINARY_OPS_1ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBINARY_OPS_1_in_ruleBinaryOperation19097);
            	    lv_op_2_0=ruleBINARY_OPS_1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation1Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"BINARY_OPS_1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3878:2: ( (lv_right_3_0= ruleUnaryOrPrimary ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3879:1: (lv_right_3_0= ruleUnaryOrPrimary )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3879:1: (lv_right_3_0= ruleUnaryOrPrimary )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3880:3: lv_right_3_0= ruleUnaryOrPrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation1Access().getRightUnaryOrPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryOrPrimary_in_ruleBinaryOperation19118);
            	    lv_right_3_0=ruleUnaryOrPrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation1Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UnaryOrPrimary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperation1"


    // $ANTLR start "entryRuleBinaryOperation2"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3904:1: entryRuleBinaryOperation2 returns [EObject current=null] : iv_ruleBinaryOperation2= ruleBinaryOperation2 EOF ;
    public final EObject entryRuleBinaryOperation2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation2 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3905:2: (iv_ruleBinaryOperation2= ruleBinaryOperation2 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3906:2: iv_ruleBinaryOperation2= ruleBinaryOperation2 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperation2Rule()); 
            pushFollow(FOLLOW_ruleBinaryOperation2_in_entryRuleBinaryOperation29156);
            iv_ruleBinaryOperation2=ruleBinaryOperation2();

            state._fsp--;

             current =iv_ruleBinaryOperation2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperation29166); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperation2"


    // $ANTLR start "ruleBinaryOperation2"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3913:1: ruleBinaryOperation2 returns [EObject current=null] : (this_BinaryOperation1_0= ruleBinaryOperation1 ( () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) ) )* ) ;
    public final EObject ruleBinaryOperation2() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3916:28: ( (this_BinaryOperation1_0= ruleBinaryOperation1 ( () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3917:1: (this_BinaryOperation1_0= ruleBinaryOperation1 ( () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3917:1: (this_BinaryOperation1_0= ruleBinaryOperation1 ( () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3918:5: this_BinaryOperation1_0= ruleBinaryOperation1 ( () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperation2Access().getBinaryOperation1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinaryOperation1_in_ruleBinaryOperation29213);
            this_BinaryOperation1_0=ruleBinaryOperation1();

            state._fsp--;

             
                    current = this_BinaryOperation1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3926:1: ( () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=32 && LA60_0<=33)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3926:2: () ( (lv_op_2_0= ruleBINARY_OPS_2 ) ) ( (lv_right_3_0= ruleBinaryOperation1 ) )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3926:2: ()
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3927:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperation2Access().getBinaryOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3932:2: ( (lv_op_2_0= ruleBINARY_OPS_2 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3933:1: (lv_op_2_0= ruleBINARY_OPS_2 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3933:1: (lv_op_2_0= ruleBINARY_OPS_2 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3934:3: lv_op_2_0= ruleBINARY_OPS_2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation2Access().getOpBINARY_OPS_2ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBINARY_OPS_2_in_ruleBinaryOperation29243);
            	    lv_op_2_0=ruleBINARY_OPS_2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"BINARY_OPS_2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3950:2: ( (lv_right_3_0= ruleBinaryOperation1 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3951:1: (lv_right_3_0= ruleBinaryOperation1 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3951:1: (lv_right_3_0= ruleBinaryOperation1 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3952:3: lv_right_3_0= ruleBinaryOperation1
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation2Access().getRightBinaryOperation1ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinaryOperation1_in_ruleBinaryOperation29264);
            	    lv_right_3_0=ruleBinaryOperation1();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation2Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"BinaryOperation1");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperation2"


    // $ANTLR start "entryRuleBinaryOperation3"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3976:1: entryRuleBinaryOperation3 returns [EObject current=null] : iv_ruleBinaryOperation3= ruleBinaryOperation3 EOF ;
    public final EObject entryRuleBinaryOperation3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation3 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3977:2: (iv_ruleBinaryOperation3= ruleBinaryOperation3 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3978:2: iv_ruleBinaryOperation3= ruleBinaryOperation3 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperation3Rule()); 
            pushFollow(FOLLOW_ruleBinaryOperation3_in_entryRuleBinaryOperation39302);
            iv_ruleBinaryOperation3=ruleBinaryOperation3();

            state._fsp--;

             current =iv_ruleBinaryOperation3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperation39312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperation3"


    // $ANTLR start "ruleBinaryOperation3"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3985:1: ruleBinaryOperation3 returns [EObject current=null] : (this_BinaryOperation2_0= ruleBinaryOperation2 ( () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) ) )* ) ;
    public final EObject ruleBinaryOperation3() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation2_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3988:28: ( (this_BinaryOperation2_0= ruleBinaryOperation2 ( () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3989:1: (this_BinaryOperation2_0= ruleBinaryOperation2 ( () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3989:1: (this_BinaryOperation2_0= ruleBinaryOperation2 ( () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3990:5: this_BinaryOperation2_0= ruleBinaryOperation2 ( () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperation3Access().getBinaryOperation2ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinaryOperation2_in_ruleBinaryOperation39359);
            this_BinaryOperation2_0=ruleBinaryOperation2();

            state._fsp--;

             
                    current = this_BinaryOperation2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3998:1: ( () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=46 && LA61_0<=49)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3998:2: () ( (lv_op_2_0= ruleBINARY_OPS_3 ) ) ( (lv_right_3_0= ruleBinaryOperation2 ) )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3998:2: ()
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:3999:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperation3Access().getBinaryOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4004:2: ( (lv_op_2_0= ruleBINARY_OPS_3 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4005:1: (lv_op_2_0= ruleBINARY_OPS_3 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4005:1: (lv_op_2_0= ruleBINARY_OPS_3 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4006:3: lv_op_2_0= ruleBINARY_OPS_3
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation3Access().getOpBINARY_OPS_3ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBINARY_OPS_3_in_ruleBinaryOperation39389);
            	    lv_op_2_0=ruleBINARY_OPS_3();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation3Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"BINARY_OPS_3");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4022:2: ( (lv_right_3_0= ruleBinaryOperation2 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4023:1: (lv_right_3_0= ruleBinaryOperation2 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4023:1: (lv_right_3_0= ruleBinaryOperation2 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4024:3: lv_right_3_0= ruleBinaryOperation2
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation3Access().getRightBinaryOperation2ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinaryOperation2_in_ruleBinaryOperation39410);
            	    lv_right_3_0=ruleBinaryOperation2();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation3Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"BinaryOperation2");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperation3"


    // $ANTLR start "entryRuleBinaryOperation4"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4048:1: entryRuleBinaryOperation4 returns [EObject current=null] : iv_ruleBinaryOperation4= ruleBinaryOperation4 EOF ;
    public final EObject entryRuleBinaryOperation4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation4 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4049:2: (iv_ruleBinaryOperation4= ruleBinaryOperation4 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4050:2: iv_ruleBinaryOperation4= ruleBinaryOperation4 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperation4Rule()); 
            pushFollow(FOLLOW_ruleBinaryOperation4_in_entryRuleBinaryOperation49448);
            iv_ruleBinaryOperation4=ruleBinaryOperation4();

            state._fsp--;

             current =iv_ruleBinaryOperation4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperation49458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperation4"


    // $ANTLR start "ruleBinaryOperation4"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4057:1: ruleBinaryOperation4 returns [EObject current=null] : (this_BinaryOperation3_0= ruleBinaryOperation3 ( () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) ) )* ) ;
    public final EObject ruleBinaryOperation4() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation3_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4060:28: ( (this_BinaryOperation3_0= ruleBinaryOperation3 ( () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4061:1: (this_BinaryOperation3_0= ruleBinaryOperation3 ( () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4061:1: (this_BinaryOperation3_0= ruleBinaryOperation3 ( () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4062:5: this_BinaryOperation3_0= ruleBinaryOperation3 ( () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperation4Access().getBinaryOperation3ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinaryOperation3_in_ruleBinaryOperation49505);
            this_BinaryOperation3_0=ruleBinaryOperation3();

            state._fsp--;

             
                    current = this_BinaryOperation3_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4070:1: ( () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=50 && LA62_0<=51)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4070:2: () ( (lv_op_2_0= ruleBINARY_OPS_4 ) ) ( (lv_right_3_0= ruleBinaryOperation3 ) )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4070:2: ()
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4071:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperation4Access().getBinaryOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4076:2: ( (lv_op_2_0= ruleBINARY_OPS_4 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4077:1: (lv_op_2_0= ruleBINARY_OPS_4 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4077:1: (lv_op_2_0= ruleBINARY_OPS_4 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4078:3: lv_op_2_0= ruleBINARY_OPS_4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation4Access().getOpBINARY_OPS_4ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBINARY_OPS_4_in_ruleBinaryOperation49535);
            	    lv_op_2_0=ruleBINARY_OPS_4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation4Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"BINARY_OPS_4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4094:2: ( (lv_right_3_0= ruleBinaryOperation3 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4095:1: (lv_right_3_0= ruleBinaryOperation3 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4095:1: (lv_right_3_0= ruleBinaryOperation3 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4096:3: lv_right_3_0= ruleBinaryOperation3
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation4Access().getRightBinaryOperation3ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinaryOperation3_in_ruleBinaryOperation49556);
            	    lv_right_3_0=ruleBinaryOperation3();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation4Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"BinaryOperation3");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperation4"


    // $ANTLR start "entryRuleBinaryOperation5"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4120:1: entryRuleBinaryOperation5 returns [EObject current=null] : iv_ruleBinaryOperation5= ruleBinaryOperation5 EOF ;
    public final EObject entryRuleBinaryOperation5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation5 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4121:2: (iv_ruleBinaryOperation5= ruleBinaryOperation5 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4122:2: iv_ruleBinaryOperation5= ruleBinaryOperation5 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperation5Rule()); 
            pushFollow(FOLLOW_ruleBinaryOperation5_in_entryRuleBinaryOperation59594);
            iv_ruleBinaryOperation5=ruleBinaryOperation5();

            state._fsp--;

             current =iv_ruleBinaryOperation5; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOperation59604); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperation5"


    // $ANTLR start "ruleBinaryOperation5"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4129:1: ruleBinaryOperation5 returns [EObject current=null] : (this_BinaryOperation4_0= ruleBinaryOperation4 ( () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) ) )* ) ;
    public final EObject ruleBinaryOperation5() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation4_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4132:28: ( (this_BinaryOperation4_0= ruleBinaryOperation4 ( () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4133:1: (this_BinaryOperation4_0= ruleBinaryOperation4 ( () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4133:1: (this_BinaryOperation4_0= ruleBinaryOperation4 ( () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4134:5: this_BinaryOperation4_0= ruleBinaryOperation4 ( () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperation5Access().getBinaryOperation4ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinaryOperation4_in_ruleBinaryOperation59651);
            this_BinaryOperation4_0=ruleBinaryOperation4();

            state._fsp--;

             
                    current = this_BinaryOperation4_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4142:1: ( () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==52) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4142:2: () ( (lv_op_2_0= ruleBINARY_OPS_5 ) ) ( (lv_right_3_0= ruleBinaryOperation4 ) )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4142:2: ()
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4143:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperation5Access().getBinaryOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4148:2: ( (lv_op_2_0= ruleBINARY_OPS_5 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4149:1: (lv_op_2_0= ruleBINARY_OPS_5 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4149:1: (lv_op_2_0= ruleBINARY_OPS_5 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4150:3: lv_op_2_0= ruleBINARY_OPS_5
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation5Access().getOpBINARY_OPS_5ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBINARY_OPS_5_in_ruleBinaryOperation59681);
            	    lv_op_2_0=ruleBINARY_OPS_5();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation5Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"BINARY_OPS_5");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4166:2: ( (lv_right_3_0= ruleBinaryOperation4 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4167:1: (lv_right_3_0= ruleBinaryOperation4 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4167:1: (lv_right_3_0= ruleBinaryOperation4 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4168:3: lv_right_3_0= ruleBinaryOperation4
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperation5Access().getRightBinaryOperation4ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinaryOperation4_in_ruleBinaryOperation59702);
            	    lv_right_3_0=ruleBinaryOperation4();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperation5Rule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"BinaryOperation4");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperation5"


    // $ANTLR start "entryRuleValueOperation"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4192:1: entryRuleValueOperation returns [EObject current=null] : iv_ruleValueOperation= ruleValueOperation EOF ;
    public final EObject entryRuleValueOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueOperation = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4193:2: (iv_ruleValueOperation= ruleValueOperation EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4194:2: iv_ruleValueOperation= ruleValueOperation EOF
            {
             newCompositeNode(grammarAccess.getValueOperationRule()); 
            pushFollow(FOLLOW_ruleValueOperation_in_entryRuleValueOperation9740);
            iv_ruleValueOperation=ruleValueOperation();

            state._fsp--;

             current =iv_ruleValueOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueOperation9750); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueOperation"


    // $ANTLR start "ruleValueOperation"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4201:1: ruleValueOperation returns [EObject current=null] : (this_BinaryOperation5_0= ruleBinaryOperation5 ( () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) ) )* ) ;
    public final EObject ruleValueOperation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation5_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4204:28: ( (this_BinaryOperation5_0= ruleBinaryOperation5 ( () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) ) )* ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4205:1: (this_BinaryOperation5_0= ruleBinaryOperation5 ( () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) ) )* )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4205:1: (this_BinaryOperation5_0= ruleBinaryOperation5 ( () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) ) )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4206:5: this_BinaryOperation5_0= ruleBinaryOperation5 ( () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getValueOperationAccess().getBinaryOperation5ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBinaryOperation5_in_ruleValueOperation9797);
            this_BinaryOperation5_0=ruleBinaryOperation5();

            state._fsp--;

             
                    current = this_BinaryOperation5_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4214:1: ( () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==53) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4214:2: () ( (lv_op_2_0= ruleBINARY_OPS_6 ) ) ( (lv_right_3_0= ruleBinaryOperation5 ) )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4214:2: ()
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4215:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getValueOperationAccess().getBinaryOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4220:2: ( (lv_op_2_0= ruleBINARY_OPS_6 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4221:1: (lv_op_2_0= ruleBINARY_OPS_6 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4221:1: (lv_op_2_0= ruleBINARY_OPS_6 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4222:3: lv_op_2_0= ruleBINARY_OPS_6
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueOperationAccess().getOpBINARY_OPS_6ParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBINARY_OPS_6_in_ruleValueOperation9827);
            	    lv_op_2_0=ruleBINARY_OPS_6();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueOperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"BINARY_OPS_6");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4238:2: ( (lv_right_3_0= ruleBinaryOperation5 ) )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4239:1: (lv_right_3_0= ruleBinaryOperation5 )
            	    {
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4239:1: (lv_right_3_0= ruleBinaryOperation5 )
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4240:3: lv_right_3_0= ruleBinaryOperation5
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getValueOperationAccess().getRightBinaryOperation5ParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinaryOperation5_in_ruleValueOperation9848);
            	    lv_right_3_0=ruleBinaryOperation5();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getValueOperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"BinaryOperation5");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueOperation"


    // $ANTLR start "entryRuleUNARY_ONLY_OPS"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4264:1: entryRuleUNARY_ONLY_OPS returns [String current=null] : iv_ruleUNARY_ONLY_OPS= ruleUNARY_ONLY_OPS EOF ;
    public final String entryRuleUNARY_ONLY_OPS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARY_ONLY_OPS = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4265:2: (iv_ruleUNARY_ONLY_OPS= ruleUNARY_ONLY_OPS EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4266:2: iv_ruleUNARY_ONLY_OPS= ruleUNARY_ONLY_OPS EOF
            {
             newCompositeNode(grammarAccess.getUNARY_ONLY_OPSRule()); 
            pushFollow(FOLLOW_ruleUNARY_ONLY_OPS_in_entryRuleUNARY_ONLY_OPS9887);
            iv_ruleUNARY_ONLY_OPS=ruleUNARY_ONLY_OPS();

            state._fsp--;

             current =iv_ruleUNARY_ONLY_OPS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNARY_ONLY_OPS9898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNARY_ONLY_OPS"


    // $ANTLR start "ruleUNARY_ONLY_OPS"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4273:1: ruleUNARY_ONLY_OPS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!' ;
    public final AntlrDatatypeRuleToken ruleUNARY_ONLY_OPS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4276:28: (kw= '!' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4278:2: kw= '!'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleUNARY_ONLY_OPS9935); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUNARY_ONLY_OPSAccess().getExclamationMarkKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNARY_ONLY_OPS"


    // $ANTLR start "entryRuleUNARY_OPS"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4291:1: entryRuleUNARY_OPS returns [String current=null] : iv_ruleUNARY_OPS= ruleUNARY_OPS EOF ;
    public final String entryRuleUNARY_OPS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNARY_OPS = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4292:2: (iv_ruleUNARY_OPS= ruleUNARY_OPS EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4293:2: iv_ruleUNARY_OPS= ruleUNARY_OPS EOF
            {
             newCompositeNode(grammarAccess.getUNARY_OPSRule()); 
            pushFollow(FOLLOW_ruleUNARY_OPS_in_entryRuleUNARY_OPS9975);
            iv_ruleUNARY_OPS=ruleUNARY_OPS();

            state._fsp--;

             current =iv_ruleUNARY_OPS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNARY_OPS9986); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUNARY_OPS"


    // $ANTLR start "ruleUNARY_OPS"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4300:1: ruleUNARY_OPS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUNARY_OPS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UNARY_ONLY_OPS_0 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4303:28: ( (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | kw= '-' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4304:1: (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | kw= '-' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4304:1: (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | kw= '-' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==44) ) {
                alt65=1;
            }
            else if ( (LA65_0==33) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4305:5: this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS
                    {
                     
                            newCompositeNode(grammarAccess.getUNARY_OPSAccess().getUNARY_ONLY_OPSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUNARY_ONLY_OPS_in_ruleUNARY_OPS10033);
                    this_UNARY_ONLY_OPS_0=ruleUNARY_ONLY_OPS();

                    state._fsp--;


                    		current.merge(this_UNARY_ONLY_OPS_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4317:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleUNARY_OPS10057); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUNARY_OPSAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUNARY_OPS"


    // $ANTLR start "entryRuleBINARY_OPS_1"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4330:1: entryRuleBINARY_OPS_1 returns [String current=null] : iv_ruleBINARY_OPS_1= ruleBINARY_OPS_1 EOF ;
    public final String entryRuleBINARY_OPS_1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OPS_1 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4331:2: (iv_ruleBINARY_OPS_1= ruleBINARY_OPS_1 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4332:2: iv_ruleBINARY_OPS_1= ruleBINARY_OPS_1 EOF
            {
             newCompositeNode(grammarAccess.getBINARY_OPS_1Rule()); 
            pushFollow(FOLLOW_ruleBINARY_OPS_1_in_entryRuleBINARY_OPS_110098);
            iv_ruleBINARY_OPS_1=ruleBINARY_OPS_1();

            state._fsp--;

             current =iv_ruleBINARY_OPS_1.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY_OPS_110109); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OPS_1"


    // $ANTLR start "ruleBINARY_OPS_1"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4339:1: ruleBINARY_OPS_1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleBINARY_OPS_1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4342:28: ( (kw= '*' | kw= '/' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4343:1: (kw= '*' | kw= '/' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4343:1: (kw= '*' | kw= '/' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            else if ( (LA66_0==45) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4344:2: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBINARY_OPS_110147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_1Access().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4351:2: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBINARY_OPS_110166); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_1Access().getSolidusKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_OPS_1"


    // $ANTLR start "entryRuleBINARY_OPS_2"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4364:1: entryRuleBINARY_OPS_2 returns [String current=null] : iv_ruleBINARY_OPS_2= ruleBINARY_OPS_2 EOF ;
    public final String entryRuleBINARY_OPS_2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OPS_2 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4365:2: (iv_ruleBINARY_OPS_2= ruleBINARY_OPS_2 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4366:2: iv_ruleBINARY_OPS_2= ruleBINARY_OPS_2 EOF
            {
             newCompositeNode(grammarAccess.getBINARY_OPS_2Rule()); 
            pushFollow(FOLLOW_ruleBINARY_OPS_2_in_entryRuleBINARY_OPS_210207);
            iv_ruleBINARY_OPS_2=ruleBINARY_OPS_2();

            state._fsp--;

             current =iv_ruleBINARY_OPS_2.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY_OPS_210218); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OPS_2"


    // $ANTLR start "ruleBINARY_OPS_2"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4373:1: ruleBINARY_OPS_2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleBINARY_OPS_2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4376:28: ( (kw= '+' | kw= '-' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4377:1: (kw= '+' | kw= '-' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4377:1: (kw= '+' | kw= '-' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==32) ) {
                alt67=1;
            }
            else if ( (LA67_0==33) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4378:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleBINARY_OPS_210256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_2Access().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4385:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleBINARY_OPS_210275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_2Access().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_OPS_2"


    // $ANTLR start "entryRuleBINARY_OPS_3"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4398:1: entryRuleBINARY_OPS_3 returns [String current=null] : iv_ruleBINARY_OPS_3= ruleBINARY_OPS_3 EOF ;
    public final String entryRuleBINARY_OPS_3() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OPS_3 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4399:2: (iv_ruleBINARY_OPS_3= ruleBINARY_OPS_3 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4400:2: iv_ruleBINARY_OPS_3= ruleBINARY_OPS_3 EOF
            {
             newCompositeNode(grammarAccess.getBINARY_OPS_3Rule()); 
            pushFollow(FOLLOW_ruleBINARY_OPS_3_in_entryRuleBINARY_OPS_310316);
            iv_ruleBINARY_OPS_3=ruleBINARY_OPS_3();

            state._fsp--;

             current =iv_ruleBINARY_OPS_3.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY_OPS_310327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OPS_3"


    // $ANTLR start "ruleBINARY_OPS_3"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4407:1: ruleBINARY_OPS_3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleBINARY_OPS_3() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4410:28: ( (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4411:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4411:1: (kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt68=1;
                }
                break;
            case 47:
                {
                alt68=2;
                }
                break;
            case 48:
                {
                alt68=3;
                }
                break;
            case 49:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4412:2: kw= '<'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleBINARY_OPS_310365); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_3Access().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4419:2: kw= '<='
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleBINARY_OPS_310384); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_3Access().getLessThanSignEqualsSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4426:2: kw= '>'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleBINARY_OPS_310403); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_3Access().getGreaterThanSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4433:2: kw= '>='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleBINARY_OPS_310422); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_3Access().getGreaterThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_OPS_3"


    // $ANTLR start "entryRuleBINARY_OPS_4"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4446:1: entryRuleBINARY_OPS_4 returns [String current=null] : iv_ruleBINARY_OPS_4= ruleBINARY_OPS_4 EOF ;
    public final String entryRuleBINARY_OPS_4() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OPS_4 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4447:2: (iv_ruleBINARY_OPS_4= ruleBINARY_OPS_4 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4448:2: iv_ruleBINARY_OPS_4= ruleBINARY_OPS_4 EOF
            {
             newCompositeNode(grammarAccess.getBINARY_OPS_4Rule()); 
            pushFollow(FOLLOW_ruleBINARY_OPS_4_in_entryRuleBINARY_OPS_410463);
            iv_ruleBINARY_OPS_4=ruleBINARY_OPS_4();

            state._fsp--;

             current =iv_ruleBINARY_OPS_4.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY_OPS_410474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OPS_4"


    // $ANTLR start "ruleBINARY_OPS_4"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4455:1: ruleBINARY_OPS_4 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleBINARY_OPS_4() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4458:28: ( (kw= '==' | kw= '!=' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4459:1: (kw= '==' | kw= '!=' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4459:1: (kw= '==' | kw= '!=' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==50) ) {
                alt69=1;
            }
            else if ( (LA69_0==51) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4460:2: kw= '=='
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleBINARY_OPS_410512); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_4Access().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4467:2: kw= '!='
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleBINARY_OPS_410531); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBINARY_OPS_4Access().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_OPS_4"


    // $ANTLR start "entryRuleBINARY_OPS_5"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4480:1: entryRuleBINARY_OPS_5 returns [String current=null] : iv_ruleBINARY_OPS_5= ruleBINARY_OPS_5 EOF ;
    public final String entryRuleBINARY_OPS_5() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OPS_5 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4481:2: (iv_ruleBINARY_OPS_5= ruleBINARY_OPS_5 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4482:2: iv_ruleBINARY_OPS_5= ruleBINARY_OPS_5 EOF
            {
             newCompositeNode(grammarAccess.getBINARY_OPS_5Rule()); 
            pushFollow(FOLLOW_ruleBINARY_OPS_5_in_entryRuleBINARY_OPS_510572);
            iv_ruleBINARY_OPS_5=ruleBINARY_OPS_5();

            state._fsp--;

             current =iv_ruleBINARY_OPS_5.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY_OPS_510583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OPS_5"


    // $ANTLR start "ruleBINARY_OPS_5"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4489:1: ruleBINARY_OPS_5 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleBINARY_OPS_5() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4492:28: (kw= '&&' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4494:2: kw= '&&'
            {
            kw=(Token)match(input,52,FOLLOW_52_in_ruleBINARY_OPS_510620); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBINARY_OPS_5Access().getAmpersandAmpersandKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_OPS_5"


    // $ANTLR start "entryRuleBINARY_OPS_6"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4507:1: entryRuleBINARY_OPS_6 returns [String current=null] : iv_ruleBINARY_OPS_6= ruleBINARY_OPS_6 EOF ;
    public final String entryRuleBINARY_OPS_6() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OPS_6 = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4508:2: (iv_ruleBINARY_OPS_6= ruleBINARY_OPS_6 EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4509:2: iv_ruleBINARY_OPS_6= ruleBINARY_OPS_6 EOF
            {
             newCompositeNode(grammarAccess.getBINARY_OPS_6Rule()); 
            pushFollow(FOLLOW_ruleBINARY_OPS_6_in_entryRuleBINARY_OPS_610660);
            iv_ruleBINARY_OPS_6=ruleBINARY_OPS_6();

            state._fsp--;

             current =iv_ruleBINARY_OPS_6.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBINARY_OPS_610671); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OPS_6"


    // $ANTLR start "ruleBINARY_OPS_6"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4516:1: ruleBINARY_OPS_6 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleBINARY_OPS_6() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4519:28: (kw= '||' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4521:2: kw= '||'
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleBINARY_OPS_610708); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBINARY_OPS_6Access().getVerticalLineVerticalLineKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBINARY_OPS_6"


    // $ANTLR start "entryRuleNOT_A_BRACKET"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4534:1: entryRuleNOT_A_BRACKET returns [String current=null] : iv_ruleNOT_A_BRACKET= ruleNOT_A_BRACKET EOF ;
    public final String entryRuleNOT_A_BRACKET() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNOT_A_BRACKET = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4538:2: (iv_ruleNOT_A_BRACKET= ruleNOT_A_BRACKET EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4539:2: iv_ruleNOT_A_BRACKET= ruleNOT_A_BRACKET EOF
            {
             newCompositeNode(grammarAccess.getNOT_A_BRACKETRule()); 
            pushFollow(FOLLOW_ruleNOT_A_BRACKET_in_entryRuleNOT_A_BRACKET10754);
            iv_ruleNOT_A_BRACKET=ruleNOT_A_BRACKET();

            state._fsp--;

             current =iv_ruleNOT_A_BRACKET.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNOT_A_BRACKET10765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNOT_A_BRACKET"


    // $ANTLR start "ruleNOT_A_BRACKET"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4549:1: ruleNOT_A_BRACKET returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | this_BINARY_OPS_1_1= ruleBINARY_OPS_1 | this_BINARY_OPS_2_2= ruleBINARY_OPS_2 | this_BINARY_OPS_3_3= ruleBINARY_OPS_3 | this_BINARY_OPS_4_4= ruleBINARY_OPS_4 | this_BINARY_OPS_5_5= ruleBINARY_OPS_5 | this_BINARY_OPS_6_6= ruleBINARY_OPS_6 | kw= '#' | kw= '$' | kw= '%' | kw= '&' | kw= ',' | kw= '.' | kw= ':' | kw= ';' | this_KRONUS_ASSIGN_15= RULE_KRONUS_ASSIGN | kw= '?' | kw= '@' | kw= '\\\\' | kw= '^' | kw= '_' | kw= '`' | kw= '|' | kw= '~' | kw= '<-' | kw= '=>' | this_WS_26= RULE_WS | this_INT_27= RULE_INT | this_ID_28= ruleID | this_TRIPPLE_STRING_29= RULE_TRIPPLE_STRING | this_ML_COMMENT_30= RULE_ML_COMMENT | this_SL_COMMENT_31= RULE_SL_COMMENT | this_Keywords_32= ruleKeywords ) ;
    public final AntlrDatatypeRuleToken ruleNOT_A_BRACKET() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_KRONUS_ASSIGN_15=null;
        Token this_WS_26=null;
        Token this_INT_27=null;
        Token this_TRIPPLE_STRING_29=null;
        Token this_ML_COMMENT_30=null;
        Token this_SL_COMMENT_31=null;
        AntlrDatatypeRuleToken this_UNARY_ONLY_OPS_0 = null;

        AntlrDatatypeRuleToken this_BINARY_OPS_1_1 = null;

        AntlrDatatypeRuleToken this_BINARY_OPS_2_2 = null;

        AntlrDatatypeRuleToken this_BINARY_OPS_3_3 = null;

        AntlrDatatypeRuleToken this_BINARY_OPS_4_4 = null;

        AntlrDatatypeRuleToken this_BINARY_OPS_5_5 = null;

        AntlrDatatypeRuleToken this_BINARY_OPS_6_6 = null;

        AntlrDatatypeRuleToken this_ID_28 = null;

        AntlrDatatypeRuleToken this_Keywords_32 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4553:28: ( (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | this_BINARY_OPS_1_1= ruleBINARY_OPS_1 | this_BINARY_OPS_2_2= ruleBINARY_OPS_2 | this_BINARY_OPS_3_3= ruleBINARY_OPS_3 | this_BINARY_OPS_4_4= ruleBINARY_OPS_4 | this_BINARY_OPS_5_5= ruleBINARY_OPS_5 | this_BINARY_OPS_6_6= ruleBINARY_OPS_6 | kw= '#' | kw= '$' | kw= '%' | kw= '&' | kw= ',' | kw= '.' | kw= ':' | kw= ';' | this_KRONUS_ASSIGN_15= RULE_KRONUS_ASSIGN | kw= '?' | kw= '@' | kw= '\\\\' | kw= '^' | kw= '_' | kw= '`' | kw= '|' | kw= '~' | kw= '<-' | kw= '=>' | this_WS_26= RULE_WS | this_INT_27= RULE_INT | this_ID_28= ruleID | this_TRIPPLE_STRING_29= RULE_TRIPPLE_STRING | this_ML_COMMENT_30= RULE_ML_COMMENT | this_SL_COMMENT_31= RULE_SL_COMMENT | this_Keywords_32= ruleKeywords ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4554:1: (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | this_BINARY_OPS_1_1= ruleBINARY_OPS_1 | this_BINARY_OPS_2_2= ruleBINARY_OPS_2 | this_BINARY_OPS_3_3= ruleBINARY_OPS_3 | this_BINARY_OPS_4_4= ruleBINARY_OPS_4 | this_BINARY_OPS_5_5= ruleBINARY_OPS_5 | this_BINARY_OPS_6_6= ruleBINARY_OPS_6 | kw= '#' | kw= '$' | kw= '%' | kw= '&' | kw= ',' | kw= '.' | kw= ':' | kw= ';' | this_KRONUS_ASSIGN_15= RULE_KRONUS_ASSIGN | kw= '?' | kw= '@' | kw= '\\\\' | kw= '^' | kw= '_' | kw= '`' | kw= '|' | kw= '~' | kw= '<-' | kw= '=>' | this_WS_26= RULE_WS | this_INT_27= RULE_INT | this_ID_28= ruleID | this_TRIPPLE_STRING_29= RULE_TRIPPLE_STRING | this_ML_COMMENT_30= RULE_ML_COMMENT | this_SL_COMMENT_31= RULE_SL_COMMENT | this_Keywords_32= ruleKeywords )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4554:1: (this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS | this_BINARY_OPS_1_1= ruleBINARY_OPS_1 | this_BINARY_OPS_2_2= ruleBINARY_OPS_2 | this_BINARY_OPS_3_3= ruleBINARY_OPS_3 | this_BINARY_OPS_4_4= ruleBINARY_OPS_4 | this_BINARY_OPS_5_5= ruleBINARY_OPS_5 | this_BINARY_OPS_6_6= ruleBINARY_OPS_6 | kw= '#' | kw= '$' | kw= '%' | kw= '&' | kw= ',' | kw= '.' | kw= ':' | kw= ';' | this_KRONUS_ASSIGN_15= RULE_KRONUS_ASSIGN | kw= '?' | kw= '@' | kw= '\\\\' | kw= '^' | kw= '_' | kw= '`' | kw= '|' | kw= '~' | kw= '<-' | kw= '=>' | this_WS_26= RULE_WS | this_INT_27= RULE_INT | this_ID_28= ruleID | this_TRIPPLE_STRING_29= RULE_TRIPPLE_STRING | this_ML_COMMENT_30= RULE_ML_COMMENT | this_SL_COMMENT_31= RULE_SL_COMMENT | this_Keywords_32= ruleKeywords )
            int alt70=33;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt70=1;
                }
                break;
            case 43:
            case 45:
                {
                alt70=2;
                }
                break;
            case 32:
            case 33:
                {
                alt70=3;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt70=4;
                }
                break;
            case 50:
            case 51:
                {
                alt70=5;
                }
                break;
            case 52:
                {
                alt70=6;
                }
                break;
            case 53:
                {
                alt70=7;
                }
                break;
            case 42:
                {
                alt70=8;
                }
                break;
            case 37:
                {
                alt70=9;
                }
                break;
            case 54:
                {
                alt70=10;
                }
                break;
            case 55:
                {
                alt70=11;
                }
                break;
            case 16:
                {
                alt70=12;
                }
                break;
            case 13:
                {
                alt70=13;
                }
                break;
            case 40:
                {
                alt70=14;
                }
                break;
            case 56:
                {
                alt70=15;
                }
                break;
            case RULE_KRONUS_ASSIGN:
                {
                alt70=16;
                }
                break;
            case 57:
                {
                alt70=17;
                }
                break;
            case 41:
                {
                alt70=18;
                }
                break;
            case 58:
                {
                alt70=19;
                }
                break;
            case 59:
                {
                alt70=20;
                }
                break;
            case 14:
                {
                alt70=21;
                }
                break;
            case 60:
                {
                alt70=22;
                }
                break;
            case 61:
                {
                alt70=23;
                }
                break;
            case 62:
                {
                alt70=24;
                }
                break;
            case 63:
                {
                alt70=25;
                }
                break;
            case 18:
                {
                alt70=26;
                }
                break;
            case RULE_WS:
                {
                alt70=27;
                }
                break;
            case RULE_INT:
                {
                alt70=28;
                }
                break;
            case RULE_CAPITALIZED_ID:
            case RULE_OTHER_ID:
                {
                alt70=29;
                }
                break;
            case RULE_TRIPPLE_STRING:
                {
                alt70=30;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt70=31;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt70=32;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt70=33;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4555:5: this_UNARY_ONLY_OPS_0= ruleUNARY_ONLY_OPS
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getUNARY_ONLY_OPSParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUNARY_ONLY_OPS_in_ruleNOT_A_BRACKET10816);
                    this_UNARY_ONLY_OPS_0=ruleUNARY_ONLY_OPS();

                    state._fsp--;


                    		current.merge(this_UNARY_ONLY_OPS_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4567:5: this_BINARY_OPS_1_1= ruleBINARY_OPS_1
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getBINARY_OPS_1ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBINARY_OPS_1_in_ruleNOT_A_BRACKET10849);
                    this_BINARY_OPS_1_1=ruleBINARY_OPS_1();

                    state._fsp--;


                    		current.merge(this_BINARY_OPS_1_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4579:5: this_BINARY_OPS_2_2= ruleBINARY_OPS_2
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getBINARY_OPS_2ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBINARY_OPS_2_in_ruleNOT_A_BRACKET10882);
                    this_BINARY_OPS_2_2=ruleBINARY_OPS_2();

                    state._fsp--;


                    		current.merge(this_BINARY_OPS_2_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4591:5: this_BINARY_OPS_3_3= ruleBINARY_OPS_3
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getBINARY_OPS_3ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBINARY_OPS_3_in_ruleNOT_A_BRACKET10915);
                    this_BINARY_OPS_3_3=ruleBINARY_OPS_3();

                    state._fsp--;


                    		current.merge(this_BINARY_OPS_3_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4603:5: this_BINARY_OPS_4_4= ruleBINARY_OPS_4
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getBINARY_OPS_4ParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBINARY_OPS_4_in_ruleNOT_A_BRACKET10948);
                    this_BINARY_OPS_4_4=ruleBINARY_OPS_4();

                    state._fsp--;


                    		current.merge(this_BINARY_OPS_4_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4615:5: this_BINARY_OPS_5_5= ruleBINARY_OPS_5
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getBINARY_OPS_5ParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBINARY_OPS_5_in_ruleNOT_A_BRACKET10981);
                    this_BINARY_OPS_5_5=ruleBINARY_OPS_5();

                    state._fsp--;


                    		current.merge(this_BINARY_OPS_5_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4627:5: this_BINARY_OPS_6_6= ruleBINARY_OPS_6
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getBINARY_OPS_6ParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleBINARY_OPS_6_in_ruleNOT_A_BRACKET11014);
                    this_BINARY_OPS_6_6=ruleBINARY_OPS_6();

                    state._fsp--;


                    		current.merge(this_BINARY_OPS_6_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4639:2: kw= '#'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNOT_A_BRACKET11038); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getNumberSignKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4646:2: kw= '$'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNOT_A_BRACKET11057); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getDollarSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4653:2: kw= '%'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleNOT_A_BRACKET11076); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getPercentSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4660:2: kw= '&'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleNOT_A_BRACKET11095); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getAmpersandKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4667:2: kw= ','
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleNOT_A_BRACKET11114); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getCommaKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4674:2: kw= '.'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleNOT_A_BRACKET11133); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getFullStopKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4681:2: kw= ':'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNOT_A_BRACKET11152); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getColonKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4688:2: kw= ';'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleNOT_A_BRACKET11171); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getSemicolonKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4694:10: this_KRONUS_ASSIGN_15= RULE_KRONUS_ASSIGN
                    {
                    this_KRONUS_ASSIGN_15=(Token)match(input,RULE_KRONUS_ASSIGN,FOLLOW_RULE_KRONUS_ASSIGN_in_ruleNOT_A_BRACKET11192); 

                    		current.merge(this_KRONUS_ASSIGN_15);
                        
                     
                        newLeafNode(this_KRONUS_ASSIGN_15, grammarAccess.getNOT_A_BRACKETAccess().getKRONUS_ASSIGNTerminalRuleCall_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4703:2: kw= '?'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleNOT_A_BRACKET11216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getQuestionMarkKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4710:2: kw= '@'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleNOT_A_BRACKET11235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getCommercialAtKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4717:2: kw= '\\\\'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleNOT_A_BRACKET11254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getReverseSolidusKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4724:2: kw= '^'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleNOT_A_BRACKET11273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getCircumflexAccentKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4731:2: kw= '_'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleNOT_A_BRACKET11292); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().get_Keyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4738:2: kw= '`'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleNOT_A_BRACKET11311); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getGraveAccentKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4745:2: kw= '|'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleNOT_A_BRACKET11330); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getVerticalLineKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4752:2: kw= '~'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleNOT_A_BRACKET11349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getTildeKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4759:2: kw= '<-'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleNOT_A_BRACKET11368); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getLessThanSignHyphenMinusKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4766:2: kw= '=>'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleNOT_A_BRACKET11387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNOT_A_BRACKETAccess().getEqualsSignGreaterThanSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4772:10: this_WS_26= RULE_WS
                    {
                    this_WS_26=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleNOT_A_BRACKET11408); 

                    		current.merge(this_WS_26);
                        
                     
                        newLeafNode(this_WS_26, grammarAccess.getNOT_A_BRACKETAccess().getWSTerminalRuleCall_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4780:10: this_INT_27= RULE_INT
                    {
                    this_INT_27=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNOT_A_BRACKET11434); 

                    		current.merge(this_INT_27);
                        
                     
                        newLeafNode(this_INT_27, grammarAccess.getNOT_A_BRACKETAccess().getINTTerminalRuleCall_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4789:5: this_ID_28= ruleID
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getIDParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleID_in_ruleNOT_A_BRACKET11467);
                    this_ID_28=ruleID();

                    state._fsp--;


                    		current.merge(this_ID_28);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4800:10: this_TRIPPLE_STRING_29= RULE_TRIPPLE_STRING
                    {
                    this_TRIPPLE_STRING_29=(Token)match(input,RULE_TRIPPLE_STRING,FOLLOW_RULE_TRIPPLE_STRING_in_ruleNOT_A_BRACKET11493); 

                    		current.merge(this_TRIPPLE_STRING_29);
                        
                     
                        newLeafNode(this_TRIPPLE_STRING_29, grammarAccess.getNOT_A_BRACKETAccess().getTRIPPLE_STRINGTerminalRuleCall_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4808:10: this_ML_COMMENT_30= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_30=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleNOT_A_BRACKET11519); 

                    		current.merge(this_ML_COMMENT_30);
                        
                     
                        newLeafNode(this_ML_COMMENT_30, grammarAccess.getNOT_A_BRACKETAccess().getML_COMMENTTerminalRuleCall_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4816:10: this_SL_COMMENT_31= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_31=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleNOT_A_BRACKET11545); 

                    		current.merge(this_SL_COMMENT_31);
                        
                     
                        newLeafNode(this_SL_COMMENT_31, grammarAccess.getNOT_A_BRACKETAccess().getSL_COMMENTTerminalRuleCall_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4825:5: this_Keywords_32= ruleKeywords
                    {
                     
                            newCompositeNode(grammarAccess.getNOT_A_BRACKETAccess().getKeywordsParserRuleCall_32()); 
                        
                    pushFollow(FOLLOW_ruleKeywords_in_ruleNOT_A_BRACKET11578);
                    this_Keywords_32=ruleKeywords();

                    state._fsp--;


                    		current.merge(this_Keywords_32);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNOT_A_BRACKET"


    // $ANTLR start "entryRuleSQUIGGLY_BRACKET_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4846:1: entryRuleSQUIGGLY_BRACKET_BLOCK returns [String current=null] : iv_ruleSQUIGGLY_BRACKET_BLOCK= ruleSQUIGGLY_BRACKET_BLOCK EOF ;
    public final String entryRuleSQUIGGLY_BRACKET_BLOCK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQUIGGLY_BRACKET_BLOCK = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4850:2: (iv_ruleSQUIGGLY_BRACKET_BLOCK= ruleSQUIGGLY_BRACKET_BLOCK EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4851:2: iv_ruleSQUIGGLY_BRACKET_BLOCK= ruleSQUIGGLY_BRACKET_BLOCK EOF
            {
             newCompositeNode(grammarAccess.getSQUIGGLY_BRACKET_BLOCKRule()); 
            pushFollow(FOLLOW_ruleSQUIGGLY_BRACKET_BLOCK_in_entryRuleSQUIGGLY_BRACKET_BLOCK11634);
            iv_ruleSQUIGGLY_BRACKET_BLOCK=ruleSQUIGGLY_BRACKET_BLOCK();

            state._fsp--;

             current =iv_ruleSQUIGGLY_BRACKET_BLOCK.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSQUIGGLY_BRACKET_BLOCK11645); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSQUIGGLY_BRACKET_BLOCK"


    // $ANTLR start "ruleSQUIGGLY_BRACKET_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4861:1: ruleSQUIGGLY_BRACKET_BLOCK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSQUIGGLY_BRACKET_BLOCK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BRACKET_BLOCK_CENTER_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4865:28: ( (kw= '{' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= '}' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4866:1: (kw= '{' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= '}' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4866:1: (kw= '{' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= '}' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4867:2: kw= '{' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= '}'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleSQUIGGLY_BRACKET_BLOCK11687); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSQUIGGLY_BRACKET_BLOCKAccess().getLeftCurlyBracketKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getSQUIGGLY_BRACKET_BLOCKAccess().getBRACKET_BLOCK_CENTERParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBRACKET_BLOCK_CENTER_in_ruleSQUIGGLY_BRACKET_BLOCK11709);
            this_BRACKET_BLOCK_CENTER_1=ruleBRACKET_BLOCK_CENTER();

            state._fsp--;


            		current.merge(this_BRACKET_BLOCK_CENTER_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,17,FOLLOW_17_in_ruleSQUIGGLY_BRACKET_BLOCK11727); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSQUIGGLY_BRACKET_BLOCKAccess().getRightCurlyBracketKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSQUIGGLY_BRACKET_BLOCK"


    // $ANTLR start "entryRuleROUND_BRACKET_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4900:1: entryRuleROUND_BRACKET_BLOCK returns [String current=null] : iv_ruleROUND_BRACKET_BLOCK= ruleROUND_BRACKET_BLOCK EOF ;
    public final String entryRuleROUND_BRACKET_BLOCK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleROUND_BRACKET_BLOCK = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4904:2: (iv_ruleROUND_BRACKET_BLOCK= ruleROUND_BRACKET_BLOCK EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4905:2: iv_ruleROUND_BRACKET_BLOCK= ruleROUND_BRACKET_BLOCK EOF
            {
             newCompositeNode(grammarAccess.getROUND_BRACKET_BLOCKRule()); 
            pushFollow(FOLLOW_ruleROUND_BRACKET_BLOCK_in_entryRuleROUND_BRACKET_BLOCK11778);
            iv_ruleROUND_BRACKET_BLOCK=ruleROUND_BRACKET_BLOCK();

            state._fsp--;

             current =iv_ruleROUND_BRACKET_BLOCK.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleROUND_BRACKET_BLOCK11789); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleROUND_BRACKET_BLOCK"


    // $ANTLR start "ruleROUND_BRACKET_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4915:1: ruleROUND_BRACKET_BLOCK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleROUND_BRACKET_BLOCK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BRACKET_BLOCK_CENTER_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4919:28: ( (kw= '(' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ')' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4920:1: (kw= '(' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ')' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4920:1: (kw= '(' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ')' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4921:2: kw= '(' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ')'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleROUND_BRACKET_BLOCK11831); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getROUND_BRACKET_BLOCKAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getROUND_BRACKET_BLOCKAccess().getBRACKET_BLOCK_CENTERParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBRACKET_BLOCK_CENTER_in_ruleROUND_BRACKET_BLOCK11853);
            this_BRACKET_BLOCK_CENTER_1=ruleBRACKET_BLOCK_CENTER();

            state._fsp--;


            		current.merge(this_BRACKET_BLOCK_CENTER_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleROUND_BRACKET_BLOCK11871); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getROUND_BRACKET_BLOCKAccess().getRightParenthesisKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleROUND_BRACKET_BLOCK"


    // $ANTLR start "entryRuleSQUARE_BRACKET_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4954:1: entryRuleSQUARE_BRACKET_BLOCK returns [String current=null] : iv_ruleSQUARE_BRACKET_BLOCK= ruleSQUARE_BRACKET_BLOCK EOF ;
    public final String entryRuleSQUARE_BRACKET_BLOCK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSQUARE_BRACKET_BLOCK = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4958:2: (iv_ruleSQUARE_BRACKET_BLOCK= ruleSQUARE_BRACKET_BLOCK EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4959:2: iv_ruleSQUARE_BRACKET_BLOCK= ruleSQUARE_BRACKET_BLOCK EOF
            {
             newCompositeNode(grammarAccess.getSQUARE_BRACKET_BLOCKRule()); 
            pushFollow(FOLLOW_ruleSQUARE_BRACKET_BLOCK_in_entryRuleSQUARE_BRACKET_BLOCK11922);
            iv_ruleSQUARE_BRACKET_BLOCK=ruleSQUARE_BRACKET_BLOCK();

            state._fsp--;

             current =iv_ruleSQUARE_BRACKET_BLOCK.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSQUARE_BRACKET_BLOCK11933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSQUARE_BRACKET_BLOCK"


    // $ANTLR start "ruleSQUARE_BRACKET_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4969:1: ruleSQUARE_BRACKET_BLOCK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleSQUARE_BRACKET_BLOCK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BRACKET_BLOCK_CENTER_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4973:28: ( (kw= '[' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ']' ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4974:1: (kw= '[' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ']' )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4974:1: (kw= '[' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ']' )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:4975:2: kw= '[' this_BRACKET_BLOCK_CENTER_1= ruleBRACKET_BLOCK_CENTER kw= ']'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleSQUARE_BRACKET_BLOCK11975); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSQUARE_BRACKET_BLOCKAccess().getLeftSquareBracketKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getSQUARE_BRACKET_BLOCKAccess().getBRACKET_BLOCK_CENTERParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBRACKET_BLOCK_CENTER_in_ruleSQUARE_BRACKET_BLOCK11997);
            this_BRACKET_BLOCK_CENTER_1=ruleBRACKET_BLOCK_CENTER();

            state._fsp--;


            		current.merge(this_BRACKET_BLOCK_CENTER_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,36,FOLLOW_36_in_ruleSQUARE_BRACKET_BLOCK12015); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSQUARE_BRACKET_BLOCKAccess().getRightSquareBracketKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSQUARE_BRACKET_BLOCK"


    // $ANTLR start "entryRuleBRACKET_BLOCK_CENTER"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5008:1: entryRuleBRACKET_BLOCK_CENTER returns [String current=null] : iv_ruleBRACKET_BLOCK_CENTER= ruleBRACKET_BLOCK_CENTER EOF ;
    public final String entryRuleBRACKET_BLOCK_CENTER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBRACKET_BLOCK_CENTER = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5012:2: (iv_ruleBRACKET_BLOCK_CENTER= ruleBRACKET_BLOCK_CENTER EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5013:2: iv_ruleBRACKET_BLOCK_CENTER= ruleBRACKET_BLOCK_CENTER EOF
            {
             newCompositeNode(grammarAccess.getBRACKET_BLOCK_CENTERRule()); 
            pushFollow(FOLLOW_ruleBRACKET_BLOCK_CENTER_in_entryRuleBRACKET_BLOCK_CENTER12066);
            iv_ruleBRACKET_BLOCK_CENTER=ruleBRACKET_BLOCK_CENTER();

            state._fsp--;

             current =iv_ruleBRACKET_BLOCK_CENTER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBRACKET_BLOCK_CENTER12077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBRACKET_BLOCK_CENTER"


    // $ANTLR start "ruleBRACKET_BLOCK_CENTER"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5023:1: ruleBRACKET_BLOCK_CENTER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NOT_A_BRACKET_0= ruleNOT_A_BRACKET | this_SQUIGGLY_BRACKET_BLOCK_1= ruleSQUIGGLY_BRACKET_BLOCK | this_ROUND_BRACKET_BLOCK_2= ruleROUND_BRACKET_BLOCK | this_SQUARE_BRACKET_BLOCK_3= ruleSQUARE_BRACKET_BLOCK | this_STRING_4= RULE_STRING )* ;
    public final AntlrDatatypeRuleToken ruleBRACKET_BLOCK_CENTER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_4=null;
        AntlrDatatypeRuleToken this_NOT_A_BRACKET_0 = null;

        AntlrDatatypeRuleToken this_SQUIGGLY_BRACKET_BLOCK_1 = null;

        AntlrDatatypeRuleToken this_ROUND_BRACKET_BLOCK_2 = null;

        AntlrDatatypeRuleToken this_SQUARE_BRACKET_BLOCK_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5027:28: ( (this_NOT_A_BRACKET_0= ruleNOT_A_BRACKET | this_SQUIGGLY_BRACKET_BLOCK_1= ruleSQUIGGLY_BRACKET_BLOCK | this_ROUND_BRACKET_BLOCK_2= ruleROUND_BRACKET_BLOCK | this_SQUARE_BRACKET_BLOCK_3= ruleSQUARE_BRACKET_BLOCK | this_STRING_4= RULE_STRING )* )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5028:1: (this_NOT_A_BRACKET_0= ruleNOT_A_BRACKET | this_SQUIGGLY_BRACKET_BLOCK_1= ruleSQUIGGLY_BRACKET_BLOCK | this_ROUND_BRACKET_BLOCK_2= ruleROUND_BRACKET_BLOCK | this_SQUARE_BRACKET_BLOCK_3= ruleSQUARE_BRACKET_BLOCK | this_STRING_4= RULE_STRING )*
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5028:1: (this_NOT_A_BRACKET_0= ruleNOT_A_BRACKET | this_SQUIGGLY_BRACKET_BLOCK_1= ruleSQUIGGLY_BRACKET_BLOCK | this_ROUND_BRACKET_BLOCK_2= ruleROUND_BRACKET_BLOCK | this_SQUARE_BRACKET_BLOCK_3= ruleSQUARE_BRACKET_BLOCK | this_STRING_4= RULE_STRING )*
            loop71:
            do {
                int alt71=6;
                switch ( input.LA(1) ) {
                case RULE_CAPITALIZED_ID:
                case RULE_KRONUS_ASSIGN:
                case RULE_INT:
                case RULE_WS:
                case RULE_TRIPPLE_STRING:
                case RULE_ML_COMMENT:
                case RULE_SL_COMMENT:
                case RULE_OTHER_ID:
                case 13:
                case 14:
                case 16:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 37:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                    {
                    alt71=1;
                    }
                    break;
                case 15:
                    {
                    alt71=2;
                    }
                    break;
                case 38:
                    {
                    alt71=3;
                    }
                    break;
                case 35:
                    {
                    alt71=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt71=5;
                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5029:5: this_NOT_A_BRACKET_0= ruleNOT_A_BRACKET
            	    {
            	     
            	            newCompositeNode(grammarAccess.getBRACKET_BLOCK_CENTERAccess().getNOT_A_BRACKETParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleNOT_A_BRACKET_in_ruleBRACKET_BLOCK_CENTER12128);
            	    this_NOT_A_BRACKET_0=ruleNOT_A_BRACKET();

            	    state._fsp--;


            	    		current.merge(this_NOT_A_BRACKET_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5041:5: this_SQUIGGLY_BRACKET_BLOCK_1= ruleSQUIGGLY_BRACKET_BLOCK
            	    {
            	     
            	            newCompositeNode(grammarAccess.getBRACKET_BLOCK_CENTERAccess().getSQUIGGLY_BRACKET_BLOCKParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSQUIGGLY_BRACKET_BLOCK_in_ruleBRACKET_BLOCK_CENTER12161);
            	    this_SQUIGGLY_BRACKET_BLOCK_1=ruleSQUIGGLY_BRACKET_BLOCK();

            	    state._fsp--;


            	    		current.merge(this_SQUIGGLY_BRACKET_BLOCK_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5053:5: this_ROUND_BRACKET_BLOCK_2= ruleROUND_BRACKET_BLOCK
            	    {
            	     
            	            newCompositeNode(grammarAccess.getBRACKET_BLOCK_CENTERAccess().getROUND_BRACKET_BLOCKParserRuleCall_2()); 
            	        
            	    pushFollow(FOLLOW_ruleROUND_BRACKET_BLOCK_in_ruleBRACKET_BLOCK_CENTER12194);
            	    this_ROUND_BRACKET_BLOCK_2=ruleROUND_BRACKET_BLOCK();

            	    state._fsp--;


            	    		current.merge(this_ROUND_BRACKET_BLOCK_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5065:5: this_SQUARE_BRACKET_BLOCK_3= ruleSQUARE_BRACKET_BLOCK
            	    {
            	     
            	            newCompositeNode(grammarAccess.getBRACKET_BLOCK_CENTERAccess().getSQUARE_BRACKET_BLOCKParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleSQUARE_BRACKET_BLOCK_in_ruleBRACKET_BLOCK_CENTER12227);
            	    this_SQUARE_BRACKET_BLOCK_3=ruleSQUARE_BRACKET_BLOCK();

            	    state._fsp--;


            	    		current.merge(this_SQUARE_BRACKET_BLOCK_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5076:10: this_STRING_4= RULE_STRING
            	    {
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBRACKET_BLOCK_CENTER12253); 

            	    		current.merge(this_STRING_4);
            	        
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getBRACKET_BLOCK_CENTERAccess().getSTRINGTerminalRuleCall_4()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBRACKET_BLOCK_CENTER"


    // $ANTLR start "entryRuleSCALA_CODE_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5094:1: entryRuleSCALA_CODE_BLOCK returns [String current=null] : iv_ruleSCALA_CODE_BLOCK= ruleSCALA_CODE_BLOCK EOF ;
    public final String entryRuleSCALA_CODE_BLOCK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCALA_CODE_BLOCK = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5098:2: (iv_ruleSCALA_CODE_BLOCK= ruleSCALA_CODE_BLOCK EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5099:2: iv_ruleSCALA_CODE_BLOCK= ruleSCALA_CODE_BLOCK EOF
            {
             newCompositeNode(grammarAccess.getSCALA_CODE_BLOCKRule()); 
            pushFollow(FOLLOW_ruleSCALA_CODE_BLOCK_in_entryRuleSCALA_CODE_BLOCK12310);
            iv_ruleSCALA_CODE_BLOCK=ruleSCALA_CODE_BLOCK();

            state._fsp--;

             current =iv_ruleSCALA_CODE_BLOCK.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSCALA_CODE_BLOCK12321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSCALA_CODE_BLOCK"


    // $ANTLR start "ruleSCALA_CODE_BLOCK"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5109:1: ruleSCALA_CODE_BLOCK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SQUIGGLY_BRACKET_BLOCK_0= ruleSQUIGGLY_BRACKET_BLOCK ;
    public final AntlrDatatypeRuleToken ruleSCALA_CODE_BLOCK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SQUIGGLY_BRACKET_BLOCK_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5113:28: (this_SQUIGGLY_BRACKET_BLOCK_0= ruleSQUIGGLY_BRACKET_BLOCK )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5115:5: this_SQUIGGLY_BRACKET_BLOCK_0= ruleSQUIGGLY_BRACKET_BLOCK
            {
             
                    newCompositeNode(grammarAccess.getSCALA_CODE_BLOCKAccess().getSQUIGGLY_BRACKET_BLOCKParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSQUIGGLY_BRACKET_BLOCK_in_ruleSCALA_CODE_BLOCK12371);
            this_SQUIGGLY_BRACKET_BLOCK_0=ruleSQUIGGLY_BRACKET_BLOCK();

            state._fsp--;


            		current.merge(this_SQUIGGLY_BRACKET_BLOCK_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSCALA_CODE_BLOCK"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5136:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5137:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5138:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN12420);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN12431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5145:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TRUE_0 = null;

        AntlrDatatypeRuleToken this_FALSE_1 = null;


         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5148:28: ( (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5149:1: (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5149:1: (this_TRUE_0= ruleTRUE | this_FALSE_1= ruleFALSE )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==28) ) {
                alt72=1;
            }
            else if ( (LA72_0==21) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5150:5: this_TRUE_0= ruleTRUE
                    {
                     
                            newCompositeNode(grammarAccess.getBOOLEANAccess().getTRUEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTRUE_in_ruleBOOLEAN12478);
                    this_TRUE_0=ruleTRUE();

                    state._fsp--;


                    		current.merge(this_TRUE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5162:5: this_FALSE_1= ruleFALSE
                    {
                     
                            newCompositeNode(grammarAccess.getBOOLEANAccess().getFALSEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFALSE_in_ruleBOOLEAN12511);
                    this_FALSE_1=ruleFALSE();

                    state._fsp--;


                    		current.merge(this_FALSE_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleDOUBLE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5180:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5181:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5182:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE12557);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE12568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5189:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5192:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5193:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5193:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5193:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE12608); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleDOUBLE12626); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE12641); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleID"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5221:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5222:2: (iv_ruleID= ruleID EOF )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5223:2: iv_ruleID= ruleID EOF
            {
             newCompositeNode(grammarAccess.getIDRule()); 
            pushFollow(FOLLOW_ruleID_in_entryRuleID12687);
            iv_ruleID=ruleID();

            state._fsp--;

             current =iv_ruleID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleID12698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5230:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CAPITALIZED_ID_0= RULE_CAPITALIZED_ID | this_OTHER_ID_1= RULE_OTHER_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CAPITALIZED_ID_0=null;
        Token this_OTHER_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5233:28: ( (this_CAPITALIZED_ID_0= RULE_CAPITALIZED_ID | this_OTHER_ID_1= RULE_OTHER_ID ) )
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5234:1: (this_CAPITALIZED_ID_0= RULE_CAPITALIZED_ID | this_OTHER_ID_1= RULE_OTHER_ID )
            {
            // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5234:1: (this_CAPITALIZED_ID_0= RULE_CAPITALIZED_ID | this_OTHER_ID_1= RULE_OTHER_ID )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_CAPITALIZED_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_OTHER_ID) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5234:6: this_CAPITALIZED_ID_0= RULE_CAPITALIZED_ID
                    {
                    this_CAPITALIZED_ID_0=(Token)match(input,RULE_CAPITALIZED_ID,FOLLOW_RULE_CAPITALIZED_ID_in_ruleID12738); 

                    		current.merge(this_CAPITALIZED_ID_0);
                        
                     
                        newLeafNode(this_CAPITALIZED_ID_0, grammarAccess.getIDAccess().getCAPITALIZED_IDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.ms.qaTools.saturn.kronus/src-gen/com/ms/qaTools/saturn/parser/antlr/internal/InternalKronus.g:5242:10: this_OTHER_ID_1= RULE_OTHER_ID
                    {
                    this_OTHER_ID_1=(Token)match(input,RULE_OTHER_ID,FOLLOW_RULE_OTHER_ID_in_ruleID12764); 

                    		current.merge(this_OTHER_ID_1);
                        
                     
                        newLeafNode(this_OTHER_ID_1, grammarAccess.getIDAccess().getOTHER_IDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA5_eotS =
        "\25\uffff";
    static final String DFA5_eofS =
        "\25\uffff";
    static final String DFA5_minS =
        "\1\24\1\uffff\2\4\4\uffff\2\46\1\4\2\5\1\24\1\6\1\20\1\4\2\5\1"+
        "\6\1\20";
    static final String DFA5_maxS =
        "\1\52\1\uffff\1\52\1\14\4\uffff\2\46\1\47\2\5\1\52\1\6\1\47\1\14"+
        "\2\5\1\6\1\47";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\2\1\4\1\3\15\uffff";
    static final String DFA5_specialS =
        "\25\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\10\uffff\1\1\1\4\12\uffff\1\4\1\3",
            "",
            "\1\6\44\uffff\1\5\1\7",
            "\1\10\7\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\12",
            "\1\12",
            "\1\13\7\uffff\1\14\32\uffff\1\15",
            "\1\16",
            "\1\16",
            "\1\6\11\uffff\1\4\12\uffff\1\4\1\3",
            "\1\17",
            "\1\20\26\uffff\1\15",
            "\1\21\7\uffff\1\22",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\20\26\uffff\1\15"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "244:1: (this_TypeDef_0= ruleTypeDef | this_AnnotationDef_1= ruleAnnotationDef | this_HashtagDef_2= ruleHashtagDef | this_FunctionDef_3= ruleFunctionDef | this_ValDef_4= ruleValDef )";
        }
    }
    static final String DFA52_eotS =
        "\15\uffff";
    static final String DFA52_eofS =
        "\2\uffff\2\10\1\uffff\1\14\7\uffff";
    static final String DFA52_minS =
        "\1\4\1\uffff\2\15\1\uffff\1\15\7\uffff";
    static final String DFA52_maxS =
        "\1\43\1\uffff\2\65\1\uffff\1\65\7\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\uffff\1\10\1\11\1\2\1\4\1\3\1\6\1\7";
    static final String DFA52_specialS =
        "\15\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\1\uffff\1\4\1\5\4\uffff\1\3\2\uffff\1\7\5\uffff\1\6\1"+
            "\7\2\uffff\1\7\2\uffff\1\6\6\uffff\1\1",
            "",
            "\1\11\2\uffff\2\10\2\uffff\1\10\6\uffff\1\10\1\uffff\2\10"+
            "\1\uffff\2\10\2\uffff\1\10\1\uffff\1\12\1\10\1\uffff\3\10\1"+
            "\uffff\11\10",
            "\1\11\2\uffff\2\10\2\uffff\1\10\6\uffff\1\10\1\uffff\2\10"+
            "\1\uffff\2\10\2\uffff\1\10\1\uffff\1\12\1\10\1\uffff\3\10\1"+
            "\uffff\11\10",
            "",
            "\1\13\2\uffff\2\14\2\uffff\1\14\6\uffff\1\14\1\uffff\2\14"+
            "\1\uffff\2\14\2\uffff\1\14\2\uffff\1\14\1\uffff\3\14\1\uffff"+
            "\11\14",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3205:1: (this_Sequence_0= ruleSequence | this_ValRef_1= ruleValRef | this_FunctionCall_2= ruleFunctionCall | this_IncludeRef_3= ruleIncludeRef | this_StringLiteral_4= ruleStringLiteral | this_DoubleLiteral_5= ruleDoubleLiteral | this_IntegerLiteral_6= ruleIntegerLiteral | this_BooleanLiteral_7= ruleBooleanLiteral | this_CodeBlock_8= ruleCodeBlock )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTopLevelKronus_in_entryRuleTopLevelKronus75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelKronus85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDef_in_ruleTopLevelKronus131 = new BitSet(new long[]{0x0000060069900000L});
    public static final BitSet FOLLOW_ruleKronus_in_ruleTopLevelKronus152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKronus_in_entryRuleKronus188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKronus198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDef_in_ruleKronus253 = new BitSet(new long[]{0x0000060069900002L});
    public static final BitSet FOLLOW_ruleIncludeDef_in_ruleKronus275 = new BitSet(new long[]{0x0000060069100002L});
    public static final BitSet FOLLOW_ruleAbstractDef_in_ruleKronus297 = new BitSet(new long[]{0x0000060068100002L});
    public static final BitSet FOLLOW_ruleRETURN_in_ruleKronus315 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_ruleKronus335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDef_in_entryRuleAbstractDef373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDef383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleAbstractDef430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDef_in_ruleAbstractDef457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashtagDef_in_ruleAbstractDef484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDef_in_ruleAbstractDef511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValDef_in_ruleAbstractDef538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValDef_in_entryRuleValDef575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValDef585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashtagCall_in_ruleValDef631 = new BitSet(new long[]{0x0000060060100000L});
    public static final BitSet FOLLOW_ruleAnnotationCall_in_ruleValDef653 = new BitSet(new long[]{0x0000060060100000L});
    public static final BitSet FOLLOW_ruleVAL_in_ruleValDef670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleValDef686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleValDef702 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_ruleValDef722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDef_in_entryRulePackageDef758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDef768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_in_rulePackageDef809 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModuleParts_in_rulePackageDef829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDef_in_entryRuleImportDef865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDef875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORT_in_ruleImportDef916 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModuleDef_in_ruleImportDef936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDef_in_entryRuleIncludeDef972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDef982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINCLUDE_in_ruleIncludeDef1023 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModuleDef_in_ruleIncludeDef1043 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleAS_in_ruleIncludeDef1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleIncludeDef1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulePart_in_entryRuleModulePart1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulePart1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleModulePart1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywords_in_ruleModulePart1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDef_in_entryRuleModuleDef1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDef1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParts_in_ruleModuleDef1325 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleModuleDef1344 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleModuleDef1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleLeaf_in_ruleModuleDef1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleParts_in_entryRuleModuleParts1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleParts1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulePart_in_ruleModuleParts1497 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleModuleParts1516 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModulePart_in_ruleModuleParts1538 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleModuleLeaf_in_entryRuleModuleLeaf1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleLeaf1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModuleLeaf1645 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModuleLeafPart_in_ruleModuleLeaf1667 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleModuleLeaf1686 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModuleLeafPart_in_ruleModuleLeaf1708 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleModuleLeaf1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleLeafPart_in_entryRuleModuleLeafPart1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleLeafPart1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulePart_in_ruleModuleLeafPart1841 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleModuleLeafPart1860 = new BitSet(new long[]{0x00000600FFF81010L});
    public static final BitSet FOLLOW_ruleModulePart_in_ruleModuleLeafPart1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAS_in_entryRuleAS1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAS1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAS1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDEF_in_entryRuleDEF2022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDEF2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDEF2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFALSE_in_entryRuleFALSE2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFALSE2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFALSE2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGENERATE_in_entryRuleGENERATE2198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGENERATE2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleGENERATE2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORT_in_entryRuleIMPORT2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIMPORT2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIMPORT2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINCLUDE_in_entryRuleINCLUDE2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINCLUDE2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleINCLUDE2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKRONUSKW_in_entryRuleKRONUSKW2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKRONUSKW2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleKRONUSKW2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_in_entryRulePACKAGE2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePACKAGE2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePACKAGE2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_in_entryRuleRETURN2638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRETURN2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRETURN2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRUE_in_entryRuleTRUE2726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTRUE2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTRUE2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_entryRuleTYPE2814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPE2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTYPE2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_entryRuleVAL2902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAL2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVAL2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWITH_in_entryRuleWITH2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWITH3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleWITH3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywords_in_entryRuleKeywords3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeywords3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAS_in_ruleKeywords3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDEF_in_ruleKeywords3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFALSE_in_ruleKeywords3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGENERATE_in_ruleKeywords3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIMPORT_in_ruleKeywords3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINCLUDE_in_ruleKeywords3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKRONUSKW_in_ruleKeywords3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_in_ruleKeywords3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_in_ruleKeywords3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRUE_in_ruleKeywords3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleKeywords3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAL_in_ruleKeywords3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWITH_in_ruleKeywords3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTypeParameter3632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33_in_ruleTypeParameter3661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleTypeParameter3695 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleTypeParameter3713 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypeInstance_in_ruleTypeParameter3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef3772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleTypeDef3823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleTypeDef3839 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_35_in_ruleTypeDef3857 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTypeDef3878 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleTypeDef3891 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTypeDef3912 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleTypeDef3926 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleTypeDef3940 = new BitSet(new long[]{0x0000002000005010L});
    public static final BitSet FOLLOW_ruleTypeValue_in_ruleTypeDef3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValue_in_entryRuleTypeValue4004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeValue4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeValueAtomic_in_ruleTypeValue4065 = new BitSet(new long[]{0x00000600FFF81012L});
    public static final BitSet FOLLOW_ruleWITH_in_ruleTypeValue4081 = new BitSet(new long[]{0x0000002000005010L});
    public static final BitSet FOLLOW_ruleTypeValueAtomic_in_ruleTypeValue4101 = new BitSet(new long[]{0x00000600FFF81012L});
    public static final BitSet FOLLOW_ruleTypeValueAtomic_in_entryRuleTypeValueAtomic4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeValueAtomic4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeValueAtomic4199 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleTypeValueAtomic4212 = new BitSet(new long[]{0x0000002000005010L});
    public static final BitSet FOLLOW_ruleTypeValue_in_ruleTypeValueAtomic4233 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleTypeValueAtomic4246 = new BitSet(new long[]{0x0000002000005010L});
    public static final BitSet FOLLOW_ruleTypeValue_in_ruleTypeValueAtomic4267 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleTypeValueAtomic4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeNameStr_in_entryRuleTypeNameStr4326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeNameStr4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTypeNameStr4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleTypeNameStr4408 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeNameStr4427 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleID_in_ruleTypeNameStr4449 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTypeNameStr4470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeNameStr4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName4530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeNameStr_in_ruleTypeName4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef4626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeRef4677 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleID_in_ruleTypeRef4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId4740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleTypeId4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeId4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeInstance_in_entryRuleTypeInstance4859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeInstance4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleTypeInstance4917 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleTypeInstance4930 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypeInstance_in_ruleTypeInstance4951 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleTypeInstance4964 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypeInstance_in_ruleTypeInstance4985 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleTypeInstance4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDef_in_entryRuleFunctionDef5037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDef5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashtagCall_in_ruleFunctionDef5093 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_ruleDEF_in_ruleFunctionDef5110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleFunctionDef5126 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleFunctionDef5144 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleFunctionDef5165 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDef5178 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleFunctionDef5199 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleFunctionDef5213 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFunctionDef5227 = new BitSet(new long[]{0x0000008000001010L});
    public static final BitSet FOLLOW_ruleParameterDef_in_ruleFunctionDef5249 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDef5262 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleParameterDef_in_ruleFunctionDef5283 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_39_in_ruleFunctionDef5299 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFunctionDef5311 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypeInstance_in_ruleFunctionDef5332 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleCodeAssignment_in_ruleFunctionDef5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationDef_in_entryRuleAnnotationDef5390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationDef5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDEF_in_ruleAnnotationDef5441 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAnnotationDef5452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleAnnotationDef5469 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAnnotationDef5486 = new BitSet(new long[]{0x0000008000001010L});
    public static final BitSet FOLLOW_ruleParameterDef_in_ruleAnnotationDef5508 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotationDef5521 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleParameterDef_in_ruleAnnotationDef5542 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_39_in_ruleAnnotationDef5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashtagDef_in_entryRuleHashtagDef5594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashtagDef5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDEF_in_ruleHashtagDef5645 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleHashtagDef5656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleHashtagDef5673 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleHashtagDef5690 = new BitSet(new long[]{0x0000008000001010L});
    public static final BitSet FOLLOW_ruleParameterDef_in_ruleHashtagDef5712 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleHashtagDef5725 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleParameterDef_in_ruleHashtagDef5746 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_39_in_ruleHashtagDef5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeAssignment_in_entryRuleCodeAssignment5798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeAssignment5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleCodeAssignment5844 = new BitSet(new long[]{0x00000008126090D0L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleCodeAssignment5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_entryRuleCodeBlock5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeBlock5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalaCodeBlock_in_ruleCodeBlock5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKronusCodeBlock_in_ruleCodeBlock5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalaCodeBlock_in_entryRuleScalaCodeBlock6019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalaCodeBlock6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGENERATE_in_ruleScalaCodeBlock6070 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleScalaCodeBlock6081 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScalaCodeBlock6098 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleScalaCodeBlock6115 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSCALA_CODE_BLOCK_in_ruleScalaCodeBlock6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKronusCodeBlock_in_entryRuleKronusCodeBlock6172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKronusCodeBlock6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKRONUSKW_in_ruleKronusCodeBlock6228 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKronusCodeBlock6241 = new BitSet(new long[]{0x0000060069920000L});
    public static final BitSet FOLLOW_ruleKronus_in_ruleKronusCodeBlock6262 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKronusCodeBlock6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleParameterValue_in_entryRuleSimpleParameterValue6310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleParameterValue6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleSimpleParameterValue6366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleSimpleParameterValue6377 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleParameterValue6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashtagCall_in_entryRuleHashtagCall6434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashtagCall6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleHashtagCall6481 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleID_in_ruleHashtagCall6504 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleHashtagCall6516 = new BitSet(new long[]{0x0000008000001010L});
    public static final BitSet FOLLOW_ruleSimpleParameterValue_in_ruleHashtagCall6538 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleHashtagCall6551 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleSimpleParameterValue_in_ruleHashtagCall6572 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_39_in_ruleHashtagCall6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationCall_in_entryRuleAnnotationCall6624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationCall6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnnotationCall6671 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleID_in_ruleAnnotationCall6694 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAnnotationCall6706 = new BitSet(new long[]{0x000010CA126090D0L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleAnnotationCall6728 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleAnnotationCall6741 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleAnnotationCall6762 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_39_in_ruleAnnotationCall6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDef_in_entryRuleParameterDef6814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDef6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleParameterDef6870 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleParameterDef6882 = new BitSet(new long[]{0x0000000000041010L});
    public static final BitSet FOLLOW_18_in_ruleParameterDef6900 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleTypeInstance_in_ruleParameterDef6935 = new BitSet(new long[]{0x0000080000000022L});
    public static final BitSet FOLLOW_43_in_ruleParameterDef6953 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleParameterDef6979 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_ruleParameterDef6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_entryRuleParameterValue7037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValue7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordParameterValue_in_ruleParameterValue7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionParameterValue_in_ruleParameterValue7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywordParameterValue_in_entryRuleKeywordParameterValue7156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeywordParameterValue7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleKeywordParameterValue7212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleKeywordParameterValue7223 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_ruleKeywordParameterValue7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePositionParameterValue_in_entryRulePositionParameterValue7279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePositionParameterValue7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueOperation_in_rulePositionParameterValue7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary7369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrimary7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimary7444 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_rulePrimary7466 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePrimary7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue7514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleValue7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValRef_in_ruleValue7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleValue7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeRef_in_ruleValue7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValue7679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_ruleValue7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleValue7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleValue7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeBlock_in_ruleValue7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence7822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSequence7878 = new BitSet(new long[]{0x0000105A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_ruleSequence7900 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_16_in_ruleSequence7913 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleValueOperation_in_ruleSequence7934 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_36_in_ruleSequence7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValRef_in_entryRuleValRef7986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValRef7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleValRef8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall8078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleFunctionCall8136 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFunctionCall8148 = new BitSet(new long[]{0x000010CA126090D0L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleFunctionCall8170 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionCall8183 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleFunctionCall8204 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_39_in_ruleFunctionCall8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeRef_in_entryRuleIncludeRef8256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeRef8266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleIncludeRef8314 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIncludeRef8326 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleValRef_in_ruleIncludeRef8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleIncludeRef8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleLiteral_in_entryRuleDoubleLiteral8498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleLiteral8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleDoubleLiteral8553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral8588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleBooleanLiteral8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation8769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPS_in_ruleUnaryOperation8834 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleUnaryOrPrimary_in_ruleUnaryOperation8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrPrimary_in_entryRuleUnaryOrPrimary8891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrPrimary8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleUnaryOrPrimary8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOrPrimary8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation1_in_entryRuleBinaryOperation19010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation19020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrPrimary_in_ruleBinaryOperation19067 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_1_in_ruleBinaryOperation19097 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleUnaryOrPrimary_in_ruleBinaryOperation19118 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation2_in_entryRuleBinaryOperation29156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation29166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation1_in_ruleBinaryOperation29213 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_2_in_ruleBinaryOperation29243 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleBinaryOperation1_in_ruleBinaryOperation29264 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation3_in_entryRuleBinaryOperation39302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation39312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation2_in_ruleBinaryOperation39359 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_3_in_ruleBinaryOperation39389 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleBinaryOperation2_in_ruleBinaryOperation39410 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation4_in_entryRuleBinaryOperation49448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation49458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation3_in_ruleBinaryOperation49505 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_4_in_ruleBinaryOperation49535 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleBinaryOperation3_in_ruleBinaryOperation49556 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation5_in_entryRuleBinaryOperation59594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation59604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation4_in_ruleBinaryOperation59651 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_5_in_ruleBinaryOperation59681 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleBinaryOperation4_in_ruleBinaryOperation59702 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleValueOperation_in_entryRuleValueOperation9740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueOperation9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOperation5_in_ruleValueOperation9797 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_6_in_ruleValueOperation9827 = new BitSet(new long[]{0x0000104A126090D0L});
    public static final BitSet FOLLOW_ruleBinaryOperation5_in_ruleValueOperation9848 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_ONLY_OPS_in_entryRuleUNARY_ONLY_OPS9887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNARY_ONLY_OPS9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUNARY_ONLY_OPS9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_OPS_in_entryRuleUNARY_OPS9975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNARY_OPS9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_ONLY_OPS_in_ruleUNARY_OPS10033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleUNARY_OPS10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_1_in_entryRuleBINARY_OPS_110098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY_OPS_110109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBINARY_OPS_110147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBINARY_OPS_110166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_2_in_entryRuleBINARY_OPS_210207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY_OPS_210218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBINARY_OPS_210256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBINARY_OPS_210275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_3_in_entryRuleBINARY_OPS_310316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY_OPS_310327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBINARY_OPS_310365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBINARY_OPS_310384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBINARY_OPS_310403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBINARY_OPS_310422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_4_in_entryRuleBINARY_OPS_410463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY_OPS_410474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBINARY_OPS_410512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBINARY_OPS_410531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_5_in_entryRuleBINARY_OPS_510572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY_OPS_510583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBINARY_OPS_510620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_6_in_entryRuleBINARY_OPS_610660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBINARY_OPS_610671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBINARY_OPS_610708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOT_A_BRACKET_in_entryRuleNOT_A_BRACKET10754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNOT_A_BRACKET10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNARY_ONLY_OPS_in_ruleNOT_A_BRACKET10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_1_in_ruleNOT_A_BRACKET10849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_2_in_ruleNOT_A_BRACKET10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_3_in_ruleNOT_A_BRACKET10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_4_in_ruleNOT_A_BRACKET10948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_5_in_ruleNOT_A_BRACKET10981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBINARY_OPS_6_in_ruleNOT_A_BRACKET11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNOT_A_BRACKET11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNOT_A_BRACKET11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNOT_A_BRACKET11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNOT_A_BRACKET11095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNOT_A_BRACKET11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNOT_A_BRACKET11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNOT_A_BRACKET11152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNOT_A_BRACKET11171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KRONUS_ASSIGN_in_ruleNOT_A_BRACKET11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNOT_A_BRACKET11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNOT_A_BRACKET11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNOT_A_BRACKET11254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNOT_A_BRACKET11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleNOT_A_BRACKET11292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNOT_A_BRACKET11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleNOT_A_BRACKET11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNOT_A_BRACKET11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNOT_A_BRACKET11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNOT_A_BRACKET11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleNOT_A_BRACKET11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNOT_A_BRACKET11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleNOT_A_BRACKET11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRIPPLE_STRING_in_ruleNOT_A_BRACKET11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleNOT_A_BRACKET11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleNOT_A_BRACKET11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeywords_in_ruleNOT_A_BRACKET11578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSQUIGGLY_BRACKET_BLOCK_in_entryRuleSQUIGGLY_BRACKET_BLOCK11634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSQUIGGLY_BRACKET_BLOCK11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSQUIGGLY_BRACKET_BLOCK11687 = new BitSet(new long[]{0xFFFFFF6BFFFFFFF0L});
    public static final BitSet FOLLOW_ruleBRACKET_BLOCK_CENTER_in_ruleSQUIGGLY_BRACKET_BLOCK11709 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSQUIGGLY_BRACKET_BLOCK11727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleROUND_BRACKET_BLOCK_in_entryRuleROUND_BRACKET_BLOCK11778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleROUND_BRACKET_BLOCK11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleROUND_BRACKET_BLOCK11831 = new BitSet(new long[]{0xFFFFFFEBFFFDFFF0L});
    public static final BitSet FOLLOW_ruleBRACKET_BLOCK_CENTER_in_ruleROUND_BRACKET_BLOCK11853 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleROUND_BRACKET_BLOCK11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSQUARE_BRACKET_BLOCK_in_entryRuleSQUARE_BRACKET_BLOCK11922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSQUARE_BRACKET_BLOCK11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSQUARE_BRACKET_BLOCK11975 = new BitSet(new long[]{0xFFFFFF7BFFFDFFF0L});
    public static final BitSet FOLLOW_ruleBRACKET_BLOCK_CENTER_in_ruleSQUARE_BRACKET_BLOCK11997 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSQUARE_BRACKET_BLOCK12015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBRACKET_BLOCK_CENTER_in_entryRuleBRACKET_BLOCK_CENTER12066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBRACKET_BLOCK_CENTER12077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOT_A_BRACKET_in_ruleBRACKET_BLOCK_CENTER12128 = new BitSet(new long[]{0xFFFFFF6BFFFDFFF2L});
    public static final BitSet FOLLOW_ruleSQUIGGLY_BRACKET_BLOCK_in_ruleBRACKET_BLOCK_CENTER12161 = new BitSet(new long[]{0xFFFFFF6BFFFDFFF2L});
    public static final BitSet FOLLOW_ruleROUND_BRACKET_BLOCK_in_ruleBRACKET_BLOCK_CENTER12194 = new BitSet(new long[]{0xFFFFFF6BFFFDFFF2L});
    public static final BitSet FOLLOW_ruleSQUARE_BRACKET_BLOCK_in_ruleBRACKET_BLOCK_CENTER12227 = new BitSet(new long[]{0xFFFFFF6BFFFDFFF2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBRACKET_BLOCK_CENTER12253 = new BitSet(new long[]{0xFFFFFF6BFFFDFFF2L});
    public static final BitSet FOLLOW_ruleSCALA_CODE_BLOCK_in_entryRuleSCALA_CODE_BLOCK12310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSCALA_CODE_BLOCK12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSQUIGGLY_BRACKET_BLOCK_in_ruleSCALA_CODE_BLOCK12371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN12420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRUE_in_ruleBOOLEAN12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFALSE_in_ruleBOOLEAN12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE12557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE12608 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDOUBLE12626 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_entryRuleID12687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAPITALIZED_ID_in_ruleID12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OTHER_ID_in_ruleID12764 = new BitSet(new long[]{0x0000000000000002L});

}