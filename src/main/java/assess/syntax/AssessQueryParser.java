// $ANTLR 3.5.3 AssessQuery.g 2023-03-20 19:13:26

package assess.syntax;
import assess.AssessQuery;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import assess.AssessQueryBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AssessQueryParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AGAINST", "AGGREGATE", "ASSESS", 
		"B", "BY", "C", "D", "E", "F", "FLOAT", "FOR", "G", "H", "I", "ID", "INT", 
		"J", "K", "L", "LABELS", "M", "N", "O", "P", "PAST", "Q", "R", "S", "SIGN", 
		"T", "U", "USING", "V", "W", "WITH", "WS", "X", "Y", "Z", "'('", "')'", 
		"','", "'-'", "'.'", "':'", "'='", "'['", "'\\''", "']'", "'benchmark.'", 
		"'inf'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int A=4;
	public static final int AGAINST=5;
	public static final int AGGREGATE=6;
	public static final int ASSESS=7;
	public static final int B=8;
	public static final int BY=9;
	public static final int C=10;
	public static final int D=11;
	public static final int E=12;
	public static final int F=13;
	public static final int FLOAT=14;
	public static final int FOR=15;
	public static final int G=16;
	public static final int H=17;
	public static final int I=18;
	public static final int ID=19;
	public static final int INT=20;
	public static final int J=21;
	public static final int K=22;
	public static final int L=23;
	public static final int LABELS=24;
	public static final int M=25;
	public static final int N=26;
	public static final int O=27;
	public static final int P=28;
	public static final int PAST=29;
	public static final int Q=30;
	public static final int R=31;
	public static final int S=32;
	public static final int SIGN=33;
	public static final int T=34;
	public static final int U=35;
	public static final int USING=36;
	public static final int V=37;
	public static final int W=38;
	public static final int WITH=39;
	public static final int WS=40;
	public static final int X=41;
	public static final int Y=42;
	public static final int Z=43;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AssessQueryParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AssessQueryParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AssessQueryParser.tokenNames; }
	@Override public String getGrammarFileName() { return "AssessQuery.g"; }


	   AssessQueryBuilder builder;



	// $ANTLR start "parse"
	// AssessQuery.g:21:1: parse[AssessQueryBuilder builder] returns [AssessQuery parsedQuery] : result= query EOF ;
	public final AssessQuery parse(AssessQueryBuilder builder) throws RecognitionException {
		AssessQuery parsedQuery = null;


		AssessQuery result =null;

		this.builder = builder;
		try {
			// AssessQuery.g:23:5: (result= query EOF )
			// AssessQuery.g:23:7: result= query EOF
			{
			pushFollow(FOLLOW_query_in_parse66);
			result=query();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_parse68); 
			parsedQuery = result;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return parsedQuery;
	}
	// $ANTLR end "parse"



	// $ANTLR start "query"
	// AssessQuery.g:25:1: query returns [AssessQuery query] : WITH targetCube= ID ( FOR predicates= selection_predicates )? BY gammas= group_by_set ASSESS AGGREGATE '(' measurement= ID ')' ( AGAINST parsedBenchmark= benchmark )? ( USING updatedComparisonMethods= comparison_scheme[comparisonMethods] )? LABELS (labelingMethod= ID |labelingSystem= custom_labeling ) ;
	public final AssessQuery query() throws RecognitionException {
		AssessQuery query = null;


		Token targetCube=null;
		Token measurement=null;
		Token labelingMethod=null;
		Token AGGREGATE1=null;
		HashMap<String, String> predicates =null;
		HashSet<String> gammas =null;
		List<String> parsedBenchmark =null;
		List<String> updatedComparisonMethods =null;
		List<List<String>> labelingSystem =null;


		    List<String> comparisonMethods = new ArrayList<String>();
		    
		try {
			// AssessQuery.g:29:5: ( WITH targetCube= ID ( FOR predicates= selection_predicates )? BY gammas= group_by_set ASSESS AGGREGATE '(' measurement= ID ')' ( AGAINST parsedBenchmark= benchmark )? ( USING updatedComparisonMethods= comparison_scheme[comparisonMethods] )? LABELS (labelingMethod= ID |labelingSystem= custom_labeling ) )
			// AssessQuery.g:29:7: WITH targetCube= ID ( FOR predicates= selection_predicates )? BY gammas= group_by_set ASSESS AGGREGATE '(' measurement= ID ')' ( AGAINST parsedBenchmark= benchmark )? ( USING updatedComparisonMethods= comparison_scheme[comparisonMethods] )? LABELS (labelingMethod= ID |labelingSystem= custom_labeling )
			{
			match(input,WITH,FOLLOW_WITH_in_query94); 
			targetCube=(Token)match(input,ID,FOLLOW_ID_in_query100); 
			builder.setTargetCubeName((targetCube!=null?targetCube.getText():null));
			// AssessQuery.g:30:7: ( FOR predicates= selection_predicates )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==FOR) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// AssessQuery.g:30:8: FOR predicates= selection_predicates
					{
					match(input,FOR,FOLLOW_FOR_in_query111); 
					pushFollow(FOLLOW_selection_predicates_in_query117);
					predicates=selection_predicates();
					state._fsp--;

					builder.setSelectionPredicates(predicates);
					}
					break;

			}

			match(input,BY,FOLLOW_BY_in_query129); 
			pushFollow(FOLLOW_group_by_set_in_query135);
			gammas=group_by_set();
			state._fsp--;

			builder.setGroupBySet(gammas);
			match(input,ASSESS,FOLLOW_ASSESS_in_query145); 
			AGGREGATE1=(Token)match(input,AGGREGATE,FOLLOW_AGGREGATE_in_query147); 
			builder.setAggregationFunction((AGGREGATE1!=null?AGGREGATE1.getText():null));
			match(input,44,FOLLOW_44_in_query157); 
			measurement=(Token)match(input,ID,FOLLOW_ID_in_query163); 
			builder.setMeasurement((measurement!=null?measurement.getText():null));
			match(input,45,FOLLOW_45_in_query167); 
			// AssessQuery.g:35:7: ( AGAINST parsedBenchmark= benchmark )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==AGAINST) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// AssessQuery.g:35:8: AGAINST parsedBenchmark= benchmark
					{
					match(input,AGAINST,FOLLOW_AGAINST_in_query177); 
					pushFollow(FOLLOW_benchmark_in_query183);
					parsedBenchmark=benchmark();
					state._fsp--;

					builder.setBenchmarkDetails(parsedBenchmark);
					}
					break;

			}

			// AssessQuery.g:38:7: ( USING updatedComparisonMethods= comparison_scheme[comparisonMethods] )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==USING) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// AssessQuery.g:38:8: USING updatedComparisonMethods= comparison_scheme[comparisonMethods]
					{
					match(input,USING,FOLLOW_USING_in_query203); 
					pushFollow(FOLLOW_comparison_scheme_in_query209);
					updatedComparisonMethods=comparison_scheme(comparisonMethods);
					state._fsp--;

					builder.setDeltaFunctions(updatedComparisonMethods);
					}
					break;

			}

			match(input,LABELS,FOLLOW_LABELS_in_query236); 
			// AssessQuery.g:42:14: (labelingMethod= ID |labelingSystem= custom_labeling )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				alt4=1;
			}
			else if ( (LA4_0==56) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// AssessQuery.g:42:15: labelingMethod= ID
					{
					labelingMethod=(Token)match(input,ID,FOLLOW_ID_in_query243); 
					builder.buildLabelingScheme((labelingMethod!=null?labelingMethod.getText():null));
					}
					break;
				case 2 :
					// AssessQuery.g:44:9: labelingSystem= custom_labeling
					{
					pushFollow(FOLLOW_custom_labeling_in_query265);
					labelingSystem=custom_labeling();
					state._fsp--;

					builder.setLabelingRules(labelingSystem);
					}
					break;

			}

			query = builder.build();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return query;
	}
	// $ANTLR end "query"



	// $ANTLR start "selection_predicates"
	// AssessQuery.g:50:1: selection_predicates returns [HashMap<String, String> selectionPredicates] : parsed_predicate= predicate ( ',' additional_predicate= predicate )* ;
	public final HashMap<String, String> selection_predicates() throws RecognitionException {
		HashMap<String, String> selectionPredicates = null;


		ParserRuleReturnScope parsed_predicate =null;
		ParserRuleReturnScope additional_predicate =null;

		selectionPredicates = new HashMap<>();
		try {
			// AssessQuery.g:52:5: (parsed_predicate= predicate ( ',' additional_predicate= predicate )* )
			// AssessQuery.g:52:7: parsed_predicate= predicate ( ',' additional_predicate= predicate )*
			{
			pushFollow(FOLLOW_predicate_in_selection_predicates322);
			parsed_predicate=predicate();
			state._fsp--;

			selectionPredicates.put((parsed_predicate!=null?((AssessQueryParser.predicate_return)parsed_predicate).level:null), (parsed_predicate!=null?((AssessQueryParser.predicate_return)parsed_predicate).value:null));
			// AssessQuery.g:53:5: ( ',' additional_predicate= predicate )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==46) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// AssessQuery.g:53:6: ',' additional_predicate= predicate
					{
					match(input,46,FOLLOW_46_in_selection_predicates331); 
					pushFollow(FOLLOW_predicate_in_selection_predicates337);
					additional_predicate=predicate();
					state._fsp--;

					selectionPredicates.put((additional_predicate!=null?((AssessQueryParser.predicate_return)additional_predicate).level:null), (additional_predicate!=null?((AssessQueryParser.predicate_return)additional_predicate).value:null));
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return selectionPredicates;
	}
	// $ANTLR end "selection_predicates"


	public static class predicate_return extends ParserRuleReturnScope {
		public String level;
		public String value;
	};


	// $ANTLR start "predicate"
	// AssessQuery.g:56:1: predicate returns [String level, String value] : level_name= ID '=' '\\'' val= level_value '\\'' ;
	public final AssessQueryParser.predicate_return predicate() throws RecognitionException {
		AssessQueryParser.predicate_return retval = new AssessQueryParser.predicate_return();
		retval.start = input.LT(1);

		Token level_name=null;
		ParserRuleReturnScope val =null;

		try {
			// AssessQuery.g:57:5: (level_name= ID '=' '\\'' val= level_value '\\'' )
			// AssessQuery.g:57:7: level_name= ID '=' '\\'' val= level_value '\\''
			{
			level_name=(Token)match(input,ID,FOLLOW_ID_in_predicate366); 
			retval.level = (level_name!=null?level_name.getText():null);
			match(input,50,FOLLOW_50_in_predicate374); 
			match(input,52,FOLLOW_52_in_predicate376); 
			pushFollow(FOLLOW_level_value_in_predicate382);
			val=level_value();
			state._fsp--;

			retval.value = (val!=null?input.toString(val.start,val.stop):null);
			match(input,52,FOLLOW_52_in_predicate386); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class level_value_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "level_value"
	// AssessQuery.g:61:1: level_value : ( ( ID )+ | date );
	public final AssessQueryParser.level_value_return level_value() throws RecognitionException {
		AssessQueryParser.level_value_return retval = new AssessQueryParser.level_value_return();
		retval.start = input.LT(1);

		try {
			// AssessQuery.g:61:13: ( ( ID )+ | date )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				alt7=1;
			}
			else if ( (LA7_0==INT) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// AssessQuery.g:61:15: ( ID )+
					{
					// AssessQuery.g:61:15: ( ID )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// AssessQuery.g:61:15: ID
							{
							match(input,ID,FOLLOW_ID_in_level_value399); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;
				case 2 :
					// AssessQuery.g:61:21: date
					{
					pushFollow(FOLLOW_date_in_level_value404);
					date();
					state._fsp--;

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "level_value"



	// $ANTLR start "date"
	// AssessQuery.g:63:1: date : INT ( '-' INT ( '-' INT )? )? ;
	public final void date() throws RecognitionException {
		try {
			// AssessQuery.g:63:6: ( INT ( '-' INT ( '-' INT )? )? )
			// AssessQuery.g:63:8: INT ( '-' INT ( '-' INT )? )?
			{
			match(input,INT,FOLLOW_INT_in_date413); 
			// AssessQuery.g:63:12: ( '-' INT ( '-' INT )? )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==47) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// AssessQuery.g:63:13: '-' INT ( '-' INT )?
					{
					match(input,47,FOLLOW_47_in_date416); 
					match(input,INT,FOLLOW_INT_in_date418); 
					// AssessQuery.g:63:21: ( '-' INT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==47) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// AssessQuery.g:63:22: '-' INT
							{
							match(input,47,FOLLOW_47_in_date421); 
							match(input,INT,FOLLOW_INT_in_date423); 
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "date"



	// $ANTLR start "group_by_set"
	// AssessQuery.g:65:1: group_by_set returns [HashSet<String> groupBySet] : id= ID ( ',' id= ID )* ;
	public final HashSet<String> group_by_set() throws RecognitionException {
		HashSet<String> groupBySet = null;


		Token id=null;

		groupBySet = new HashSet<>();
		try {
			// AssessQuery.g:67:5: (id= ID ( ',' id= ID )* )
			// AssessQuery.g:67:7: id= ID ( ',' id= ID )*
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_group_by_set455); 
			groupBySet.add((id!=null?id.getText():null));
			// AssessQuery.g:67:42: ( ',' id= ID )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==46) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// AssessQuery.g:67:43: ',' id= ID
					{
					match(input,46,FOLLOW_46_in_group_by_set460); 
					id=(Token)match(input,ID,FOLLOW_ID_in_group_by_set464); 
					}
					break;

				default :
					break loop10;
				}
			}

			groupBySet.add((id!=null?id.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return groupBySet;
	}
	// $ANTLR end "group_by_set"



	// $ANTLR start "benchmark"
	// AssessQuery.g:70:1: benchmark returns [List<String> parsedBenchmark] : ( constant_benchmark | external_benchmark | predicate | PAST INT );
	public final List<String> benchmark() throws RecognitionException {
		List<String> parsedBenchmark = null;


		Token INT5=null;
		ParserRuleReturnScope constant_benchmark2 =null;
		ParserRuleReturnScope external_benchmark3 =null;
		ParserRuleReturnScope predicate4 =null;

		parsedBenchmark = new ArrayList<>();
		try {
			// AssessQuery.g:72:5: ( constant_benchmark | external_benchmark | predicate | PAST INT )
			int alt11=4;
			switch ( input.LA(1) ) {
			case FLOAT:
			case INT:
			case SIGN:
				{
				alt11=1;
				}
				break;
			case ID:
				{
				int LA11_2 = input.LA(2);
				if ( (LA11_2==48) ) {
					alt11=2;
				}
				else if ( (LA11_2==50) ) {
					alt11=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case PAST:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// AssessQuery.g:72:7: constant_benchmark
					{
					pushFollow(FOLLOW_constant_benchmark_in_benchmark497);
					constant_benchmark2=constant_benchmark();
					state._fsp--;

					parsedBenchmark.add("Constant");
					    parsedBenchmark.add((constant_benchmark2!=null?input.toString(constant_benchmark2.start,constant_benchmark2.stop):null));
					    
					}
					break;
				case 2 :
					// AssessQuery.g:76:7: external_benchmark
					{
					pushFollow(FOLLOW_external_benchmark_in_benchmark511);
					external_benchmark3=external_benchmark();
					state._fsp--;

					parsedBenchmark.add("External");
					     parsedBenchmark.add((external_benchmark3!=null?((AssessQueryParser.external_benchmark_return)external_benchmark3).cube:null));
					     parsedBenchmark.add((external_benchmark3!=null?((AssessQueryParser.external_benchmark_return)external_benchmark3).measurement:null));
					     
					}
					break;
				case 3 :
					// AssessQuery.g:81:7: predicate
					{
					pushFollow(FOLLOW_predicate_in_benchmark525);
					predicate4=predicate();
					state._fsp--;

					parsedBenchmark.add("Sibling");
					     parsedBenchmark.add((predicate4!=null?((AssessQueryParser.predicate_return)predicate4).level:null));
					     parsedBenchmark.add((predicate4!=null?((AssessQueryParser.predicate_return)predicate4).value:null));
					    
					}
					break;
				case 4 :
					// AssessQuery.g:86:7: PAST INT
					{
					match(input,PAST,FOLLOW_PAST_in_benchmark539); 
					INT5=(Token)match(input,INT,FOLLOW_INT_in_benchmark541); 
					parsedBenchmark.add("Past");
					    parsedBenchmark.add((INT5!=null?INT5.getText():null));
					    
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return parsedBenchmark;
	}
	// $ANTLR end "benchmark"


	public static class constant_benchmark_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "constant_benchmark"
	// AssessQuery.g:92:1: constant_benchmark : ( SIGN )? number= ( INT | FLOAT ) ;
	public final AssessQueryParser.constant_benchmark_return constant_benchmark() throws RecognitionException {
		AssessQueryParser.constant_benchmark_return retval = new AssessQueryParser.constant_benchmark_return();
		retval.start = input.LT(1);

		Token number=null;

		try {
			// AssessQuery.g:92:20: ( ( SIGN )? number= ( INT | FLOAT ) )
			// AssessQuery.g:92:22: ( SIGN )? number= ( INT | FLOAT )
			{
			// AssessQuery.g:92:22: ( SIGN )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==SIGN) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// AssessQuery.g:92:23: SIGN
					{
					match(input,SIGN,FOLLOW_SIGN_in_constant_benchmark561); 
					}
					break;

			}

			number=input.LT(1);
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_benchmark"


	public static class external_benchmark_return extends ParserRuleReturnScope {
		public String cube;
		public String measurement;
	};


	// $ANTLR start "external_benchmark"
	// AssessQuery.g:94:1: external_benchmark returns [String cube, String measurement] : benchmarkCube= ID '.' benchmarkMeasurement= ID ;
	public final AssessQueryParser.external_benchmark_return external_benchmark() throws RecognitionException {
		AssessQueryParser.external_benchmark_return retval = new AssessQueryParser.external_benchmark_return();
		retval.start = input.LT(1);

		Token benchmarkCube=null;
		Token benchmarkMeasurement=null;

		try {
			// AssessQuery.g:95:5: (benchmarkCube= ID '.' benchmarkMeasurement= ID )
			// AssessQuery.g:95:7: benchmarkCube= ID '.' benchmarkMeasurement= ID
			{
			benchmarkCube=(Token)match(input,ID,FOLLOW_ID_in_external_benchmark594); 
			retval.cube = (benchmarkCube!=null?benchmarkCube.getText():null);
			match(input,48,FOLLOW_48_in_external_benchmark598); 
			benchmarkMeasurement=(Token)match(input,ID,FOLLOW_ID_in_external_benchmark608); 
			retval.measurement = (benchmarkMeasurement!=null?benchmarkMeasurement.getText():null);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "external_benchmark"



	// $ANTLR start "comparison_scheme"
	// AssessQuery.g:98:1: comparison_scheme[List<String> comparisonMethods] returns [List<String> updatedComparisonMethods] : (method_name= ID '(' comparison_scheme[$updatedComparisonMethods] | comparison_args ')' );
	public final List<String> comparison_scheme(List<String> comparisonMethods) throws RecognitionException {
		List<String> updatedComparisonMethods = null;


		Token method_name=null;

		updatedComparisonMethods = comparisonMethods;
		try {
			// AssessQuery.g:100:5: (method_name= ID '(' comparison_scheme[$updatedComparisonMethods] | comparison_args ')' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==46) ) {
					alt13=2;
				}
				else if ( (LA13_1==44) ) {
					alt13=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// AssessQuery.g:100:7: method_name= ID '(' comparison_scheme[$updatedComparisonMethods]
					{
					method_name=(Token)match(input,ID,FOLLOW_ID_in_comparison_scheme640); 
					updatedComparisonMethods.add((method_name!=null?method_name.getText():null));
					match(input,44,FOLLOW_44_in_comparison_scheme648); 
					pushFollow(FOLLOW_comparison_scheme_in_comparison_scheme650);
					comparison_scheme(updatedComparisonMethods);
					state._fsp--;

					}
					break;
				case 2 :
					// AssessQuery.g:101:56: comparison_args ')'
					{
					pushFollow(FOLLOW_comparison_args_in_comparison_scheme655);
					comparison_args();
					state._fsp--;

					match(input,45,FOLLOW_45_in_comparison_scheme656); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return updatedComparisonMethods;
	}
	// $ANTLR end "comparison_scheme"



	// $ANTLR start "comparison_args"
	// AssessQuery.g:103:1: comparison_args : ID ',' ( ( 'benchmark.' )? ID | INT ) ;
	public final void comparison_args() throws RecognitionException {
		try {
			// AssessQuery.g:103:17: ( ID ',' ( ( 'benchmark.' )? ID | INT ) )
			// AssessQuery.g:103:19: ID ',' ( ( 'benchmark.' )? ID | INT )
			{
			match(input,ID,FOLLOW_ID_in_comparison_args664); 
			match(input,46,FOLLOW_46_in_comparison_args666); 
			// AssessQuery.g:103:26: ( ( 'benchmark.' )? ID | INT )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID||LA15_0==54) ) {
				alt15=1;
			}
			else if ( (LA15_0==INT) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// AssessQuery.g:103:28: ( 'benchmark.' )? ID
					{
					// AssessQuery.g:103:28: ( 'benchmark.' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==54) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// AssessQuery.g:103:29: 'benchmark.'
							{
							match(input,54,FOLLOW_54_in_comparison_args671); 
							}
							break;

					}

					match(input,ID,FOLLOW_ID_in_comparison_args675); 
					}
					break;
				case 2 :
					// AssessQuery.g:103:49: INT
					{
					match(input,INT,FOLLOW_INT_in_comparison_args679); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "comparison_args"



	// $ANTLR start "custom_labeling"
	// AssessQuery.g:105:1: custom_labeling returns [List<List<String>> labelingTerms] : '{' term= label_term ( ',' term= label_term )* '}' ;
	public final List<List<String>> custom_labeling() throws RecognitionException {
		List<List<String>> labelingTerms = null;


		List<String> term =null;

		labelingTerms = new ArrayList<List<String>>();
		try {
			// AssessQuery.g:107:5: ( '{' term= label_term ( ',' term= label_term )* '}' )
			// AssessQuery.g:107:7: '{' term= label_term ( ',' term= label_term )* '}'
			{
			match(input,56,FOLLOW_56_in_custom_labeling705); 
			pushFollow(FOLLOW_label_term_in_custom_labeling711);
			term=label_term();
			state._fsp--;

			labelingTerms.add(term);
			// AssessQuery.g:108:5: ( ',' term= label_term )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==46) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// AssessQuery.g:108:6: ',' term= label_term
					{
					match(input,46,FOLLOW_46_in_custom_labeling720); 
					pushFollow(FOLLOW_label_term_in_custom_labeling726);
					term=label_term();
					state._fsp--;

					labelingTerms.add(term);
					}
					break;

				default :
					break loop16;
				}
			}

			match(input,57,FOLLOW_57_in_custom_labeling732); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return labelingTerms;
	}
	// $ANTLR end "custom_labeling"



	// $ANTLR start "label_term"
	// AssessQuery.g:111:1: label_term returns [List<String> term] : range= label_range ':' label= ID ;
	public final List<String> label_term() throws RecognitionException {
		List<String> term = null;


		Token label=null;
		List<String> range =null;

		try {
			// AssessQuery.g:113:5: (range= label_range ':' label= ID )
			// AssessQuery.g:113:7: range= label_range ':' label= ID
			{
			pushFollow(FOLLOW_label_range_in_label_term763);
			range=label_range();
			state._fsp--;

			match(input,49,FOLLOW_49_in_label_term765); 
			label=(Token)match(input,ID,FOLLOW_ID_in_label_term769); 
			range.add((label!=null?label.getText():null)); 
			}

			term = range;
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "label_term"



	// $ANTLR start "label_range"
	// AssessQuery.g:115:1: label_range returns [List<String> limits] : (lowLimit= '[' |lowLimit= '(' ) start= range_point ',' end= range_point (highLimit= ')' |highLimit= ']' ) ;
	public final List<String> label_range() throws RecognitionException {
		List<String> limits = null;


		Token lowLimit=null;
		Token highLimit=null;
		ParserRuleReturnScope start =null;
		ParserRuleReturnScope end =null;

		limits = new ArrayList<String>();
		try {
			// AssessQuery.g:117:5: ( (lowLimit= '[' |lowLimit= '(' ) start= range_point ',' end= range_point (highLimit= ')' |highLimit= ']' ) )
			// AssessQuery.g:117:7: (lowLimit= '[' |lowLimit= '(' ) start= range_point ',' end= range_point (highLimit= ')' |highLimit= ']' )
			{
			// AssessQuery.g:117:7: (lowLimit= '[' |lowLimit= '(' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==51) ) {
				alt17=1;
			}
			else if ( (LA17_0==44) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// AssessQuery.g:117:9: lowLimit= '['
					{
					lowLimit=(Token)match(input,51,FOLLOW_51_in_label_range802); 
					}
					break;
				case 2 :
					// AssessQuery.g:117:26: lowLimit= '('
					{
					lowLimit=(Token)match(input,44,FOLLOW_44_in_label_range810); 
					}
					break;

			}

			limits.add((lowLimit!=null?lowLimit.getText():null));
			pushFollow(FOLLOW_range_point_in_label_range826);
			start=range_point();
			state._fsp--;

			 limits.add((start!=null?input.toString(start.start,start.stop):null)); 
			match(input,46,FOLLOW_46_in_label_range830); 
			pushFollow(FOLLOW_range_point_in_label_range842);
			end=range_point();
			state._fsp--;

			 limits.add((end!=null?input.toString(end.start,end.stop):null)); 
			// AssessQuery.g:120:7: (highLimit= ')' |highLimit= ']' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==45) ) {
				alt18=1;
			}
			else if ( (LA18_0==53) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// AssessQuery.g:120:9: highLimit= ')'
					{
					highLimit=(Token)match(input,45,FOLLOW_45_in_label_range858); 
					}
					break;
				case 2 :
					// AssessQuery.g:120:27: highLimit= ']'
					{
					highLimit=(Token)match(input,53,FOLLOW_53_in_label_range866); 
					}
					break;

			}

			limits.add((highLimit!=null?highLimit.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return limits;
	}
	// $ANTLR end "label_range"


	public static class range_point_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "range_point"
	// AssessQuery.g:123:1: range_point : ( SIGN )? ( INT | FLOAT | 'inf' ) ;
	public final AssessQueryParser.range_point_return range_point() throws RecognitionException {
		AssessQueryParser.range_point_return retval = new AssessQueryParser.range_point_return();
		retval.start = input.LT(1);

		try {
			// AssessQuery.g:123:13: ( ( SIGN )? ( INT | FLOAT | 'inf' ) )
			// AssessQuery.g:123:15: ( SIGN )? ( INT | FLOAT | 'inf' )
			{
			// AssessQuery.g:123:15: ( SIGN )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==SIGN) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// AssessQuery.g:123:15: SIGN
					{
					match(input,SIGN,FOLLOW_SIGN_in_range_point882); 
					}
					break;

			}

			if ( input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==55 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range_point"

	// Delegated rules



	public static final BitSet FOLLOW_query_in_parse66 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WITH_in_query94 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_query100 = new BitSet(new long[]{0x0000000000008200L});
	public static final BitSet FOLLOW_FOR_in_query111 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_selection_predicates_in_query117 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BY_in_query129 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_group_by_set_in_query135 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSESS_in_query145 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AGGREGATE_in_query147 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_query157 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_query163 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_query167 = new BitSet(new long[]{0x0000001001000020L});
	public static final BitSet FOLLOW_AGAINST_in_query177 = new BitSet(new long[]{0x0000000220184000L});
	public static final BitSet FOLLOW_benchmark_in_query183 = new BitSet(new long[]{0x0000001001000000L});
	public static final BitSet FOLLOW_USING_in_query203 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_comparison_scheme_in_query209 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_LABELS_in_query236 = new BitSet(new long[]{0x0100000000080000L});
	public static final BitSet FOLLOW_ID_in_query243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_custom_labeling_in_query265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_selection_predicates322 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_selection_predicates331 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_predicate_in_selection_predicates337 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_ID_in_predicate366 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_predicate374 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_predicate376 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_level_value_in_predicate382 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_predicate386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_level_value399 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_date_in_level_value404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_date413 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_date416 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INT_in_date418 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_date421 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INT_in_date423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_group_by_set455 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_group_by_set460 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_group_by_set464 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_constant_benchmark_in_benchmark497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_external_benchmark_in_benchmark511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_benchmark525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PAST_in_benchmark539 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INT_in_benchmark541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGN_in_constant_benchmark561 = new BitSet(new long[]{0x0000000000104000L});
	public static final BitSet FOLLOW_set_in_constant_benchmark569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_external_benchmark594 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_external_benchmark598 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_external_benchmark608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_comparison_scheme640 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_comparison_scheme648 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_comparison_scheme_in_comparison_scheme650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_args_in_comparison_scheme655 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_comparison_scheme656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_comparison_args664 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_comparison_args666 = new BitSet(new long[]{0x0040000000180000L});
	public static final BitSet FOLLOW_54_in_comparison_args671 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_comparison_args675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comparison_args679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_custom_labeling705 = new BitSet(new long[]{0x0008100000000000L});
	public static final BitSet FOLLOW_label_term_in_custom_labeling711 = new BitSet(new long[]{0x0200400000000000L});
	public static final BitSet FOLLOW_46_in_custom_labeling720 = new BitSet(new long[]{0x0008100000000000L});
	public static final BitSet FOLLOW_label_term_in_custom_labeling726 = new BitSet(new long[]{0x0200400000000000L});
	public static final BitSet FOLLOW_57_in_custom_labeling732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_label_range_in_label_term763 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_label_term765 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_label_term769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_label_range802 = new BitSet(new long[]{0x0080000200104000L});
	public static final BitSet FOLLOW_44_in_label_range810 = new BitSet(new long[]{0x0080000200104000L});
	public static final BitSet FOLLOW_range_point_in_label_range826 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_label_range830 = new BitSet(new long[]{0x0080000200104000L});
	public static final BitSet FOLLOW_range_point_in_label_range842 = new BitSet(new long[]{0x0020200000000000L});
	public static final BitSet FOLLOW_45_in_label_range858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_label_range866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIGN_in_range_point882 = new BitSet(new long[]{0x0080000000104000L});
	public static final BitSet FOLLOW_set_in_range_point885 = new BitSet(new long[]{0x0000000000000002L});
}
