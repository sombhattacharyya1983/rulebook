package com.deliveredtechnologies.rulebook.model.pojotestrules.failsandsucceeds;

import static com.deliveredtechnologies.rulebook.model.RuleChainActionType.STOP_ON_FAILURE;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;

@Rule(order = 1)
public class RuleWhereWhenIsSuccessAnThenHasABreakNoStop {

  @When
  public boolean when() throws Exception {
    return true;
  }
  
  @Then
  public RuleState then() throws Exception {
    return RuleState.BREAK;
  }
  
}
