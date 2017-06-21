package com.ms.qaTools.saturn.serializer;

import com.google.inject.Inject;
import com.ms.qaTools.saturn.services.KronusGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KronusSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KronusGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KronusGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getASRule())
			return getASToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDEFRule())
			return getDEFToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXPORTRule())
			return getEXPORTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getGENERATERule())
			return getGENERATEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPORTRule())
			return getIMPORTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINCLUDERule())
			return getINCLUDEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKRONUS_ASSIGNRule())
			return getKRONUS_ASSIGNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPACKAGERule())
			return getPACKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRETURNRule())
			return getRETURNToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTYPERule())
			return getTYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVALRule())
			return getVALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWITHRule())
			return getWITHToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AS: 'as';
	 */
	protected String getASToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "as";
	}
	
	/**
	 * DEF: 'def';
	 */
	protected String getDEFToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "def";
	}
	
	/**
	 * EXPORT: 'export';
	 */
	protected String getEXPORTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "export";
	}
	
	/**
	 * GENERATE: 'generate';
	 */
	protected String getGENERATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "generate";
	}
	
	/**
	 * IMPORT: 'import';
	 */
	protected String getIMPORTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import";
	}
	
	/**
	 * INCLUDE: 'include';
	 */
	protected String getINCLUDEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "include";
	}
	
	/**
	 * terminal KRONUS_ASSIGN: '=';
	 */
	protected String getKRONUS_ASSIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * PACKAGE: 'package';
	 */
	protected String getPACKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "package";
	}
	
	/**
	 * RETURN: 'return';
	 */
	protected String getRETURNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "return";
	}
	
	/**
	 * TYPE: 'type';
	 */
	protected String getTYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "type";
	}
	
	/**
	 * VAL: 'val';
	 */
	protected String getVALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "val";
	}
	
	/**
	 * WITH: 'with';
	 */
	protected String getWITHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "with";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
