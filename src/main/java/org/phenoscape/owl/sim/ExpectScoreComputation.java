package org.phenoscape.owl.sim;

import java.util.Collection;
import java.util.Map;

/**
 * Computation of Expect scores for similarity scores.
 * 
 * @author jbalhoff
 * @param <ID> The type used for an identifier (e.g. IRI, URI, String, etc.).
 */
public interface ExpectScoreComputation<ID> {

	/**
	 * For each comparison in the provided collection of ComparisonScores, compute an Expect score which takes into account 
	 * the size of the corpus and the size of each profile being compared. 
	 * 
	 * @param scores A collection of comparison score objects (e.g. all comparisons of gene profile by taxon profile).
	 * @param corpusProfileSizes Map of profile identifier to profile size (count of phenotypes in profile), for all profiles in corpus. Size of this map is size of corpus.
	 * @param queryProfileSizes Map of profile identifier to profile size (count of phenotypes in profile), for all profiles used as queries.
	 * @return Map of ComparisonScore identifiers to computed Expect Score.
	 */
	public Map<ID, Double> computeExpectScores(Collection<ComparisonScore<ID>> comparisons, Map<ID, Integer> corpusProfileSizes, Map<ID, Integer> queryProfileSizes);
	
}
