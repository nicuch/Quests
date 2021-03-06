/*******************************************************************************************************
 * Continued by PikaMug (formerly HappyPikachu) with permission from _Blackvein_. All rights reserved.
 * 
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN
 * NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************************************/

package me.blackvein.quests.events.quester;

import org.bukkit.event.HandlerList;

import me.blackvein.quests.Quest;
import me.blackvein.quests.Quester;
import me.blackvein.quests.Stage;

/**
 * Called after a quester changes stage
 */
public class QuesterPostChangeStageEvent extends QuesterEvent {
	private static final HandlerList handlers = new HandlerList();
    private Quest quest;
    private Stage current;
    private Stage next;
    
    public QuesterPostChangeStageEvent(Quester quester, Quest quest, Stage current, Stage next) {
        super(quester);
        this.quest = quest;
        this.current = current;
        this.next = next;
    }
    
    /**
	 * Returns the quest involved in this event
	 * 
	 * @return Quest who is involved in this event
	 */
    public Quest getQuest() {
        return quest;
    }
    
    public Stage getCurrentStage() {
    	return current;
    }
    
    public Stage getNextStage() {
    	return next;
    }
    
    public HandlerList getHandlers() {
        return handlers;
    }
     
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
