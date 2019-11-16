/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.quoridor.controller;
import java.util.List;
import java.util.ArrayList;
import ca.mcgill.ecse223.quoridor.model.*;

// line 9 "../../../../../PawnStateMachine.ump"
public class PawnBehaviour
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //PawnBehaviour State Machines
  public enum PawnSM { gameActive, gameComplete }
  public enum PawnSMGameActiveLongitudinal { Null, Longitudinal }
  public enum PawnSMGameActiveLongitudinalLongitudinal { Null, Between, SouthBorder, NorthBorder }
  public enum PawnSMGameActiveLongitudinalLongitudinalSouthBorder { Null, nearBorder, OnBorder }
  public enum PawnSMGameActiveLongitudinalLongitudinalNorthBorder { Null, nearBorder, OnBorder }
  public enum PawnSMGameActiveLatitudinal { Null, Latitudinal }
  public enum PawnSMGameActiveLatitudinalLatitudinal { Null, EastBorder, Between, WestBorder }
  public enum PawnSMGameActiveLatitudinalLatitudinalEastBorder { Null, nearBorder, OnBorder }
  public enum PawnSMGameActiveLatitudinalLatitudinalWestBorder { Null, nearBorder, OnBorder }
  private PawnSM pawnSM;
  private PawnSMGameActiveLongitudinal pawnSMGameActiveLongitudinal;
  private PawnSMGameActiveLongitudinalLongitudinal pawnSMGameActiveLongitudinalLongitudinal;
  private PawnSMGameActiveLongitudinalLongitudinalSouthBorder pawnSMGameActiveLongitudinalLongitudinalSouthBorder;
  private PawnSMGameActiveLongitudinalLongitudinalNorthBorder pawnSMGameActiveLongitudinalLongitudinalNorthBorder;
  private PawnSMGameActiveLatitudinal pawnSMGameActiveLatitudinal;
  private PawnSMGameActiveLatitudinalLatitudinal pawnSMGameActiveLatitudinalLatitudinal;
  private PawnSMGameActiveLatitudinalLatitudinalEastBorder pawnSMGameActiveLatitudinalLatitudinalEastBorder;
  private PawnSMGameActiveLatitudinalLatitudinalWestBorder pawnSMGameActiveLatitudinalLatitudinalWestBorder;

  //PawnBehaviour Associations
  private Game currentGame;
  private Player player;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public PawnBehaviour()
  {
    setPawnSMGameActiveLongitudinal(PawnSMGameActiveLongitudinal.Null);
    setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Null);
    setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null);
    setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null);
    setPawnSMGameActiveLatitudinal(PawnSMGameActiveLatitudinal.Null);
    setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Null);
    setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null);
    setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null);
    setPawnSM(PawnSM.gameActive);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getPawnSMFullName()
  {
    String answer = pawnSM.toString();
    if (pawnSMGameActiveLongitudinal != PawnSMGameActiveLongitudinal.Null) { answer += "." + pawnSMGameActiveLongitudinal.toString(); }
    if (pawnSMGameActiveLongitudinalLongitudinal != PawnSMGameActiveLongitudinalLongitudinal.Null) { answer += "." + pawnSMGameActiveLongitudinalLongitudinal.toString(); }
    if (pawnSMGameActiveLongitudinalLongitudinalSouthBorder != PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null) { answer += "." + pawnSMGameActiveLongitudinalLongitudinalSouthBorder.toString(); }
    if (pawnSMGameActiveLongitudinalLongitudinalNorthBorder != PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null) { answer += "." + pawnSMGameActiveLongitudinalLongitudinalNorthBorder.toString(); }
    if (pawnSMGameActiveLatitudinal != PawnSMGameActiveLatitudinal.Null) { answer += "." + pawnSMGameActiveLatitudinal.toString(); }
    if (pawnSMGameActiveLatitudinalLatitudinal != PawnSMGameActiveLatitudinalLatitudinal.Null) { answer += "." + pawnSMGameActiveLatitudinalLatitudinal.toString(); }
    if (pawnSMGameActiveLatitudinalLatitudinalEastBorder != PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null) { answer += "." + pawnSMGameActiveLatitudinalLatitudinalEastBorder.toString(); }
    if (pawnSMGameActiveLatitudinalLatitudinalWestBorder != PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null) { answer += "." + pawnSMGameActiveLatitudinalLatitudinalWestBorder.toString(); }
    if (pawnSMGameActiveLongitudinalLongitudinalSouthBorder != PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null) { answer += "." + pawnSMGameActiveLongitudinalLongitudinalSouthBorder.toString(); }
    if (pawnSMGameActiveLongitudinalLongitudinalNorthBorder != PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null) { answer += "." + pawnSMGameActiveLongitudinalLongitudinalNorthBorder.toString(); }
    if (pawnSMGameActiveLatitudinalLatitudinalEastBorder != PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null) { answer += "." + pawnSMGameActiveLatitudinalLatitudinalEastBorder.toString(); }
    if (pawnSMGameActiveLatitudinalLatitudinalWestBorder != PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null) { answer += "." + pawnSMGameActiveLatitudinalLatitudinalWestBorder.toString(); }
    return answer;
  }

  public PawnSM getPawnSM()
  {
    return pawnSM;
  }

  public PawnSMGameActiveLongitudinal getPawnSMGameActiveLongitudinal()
  {
    return pawnSMGameActiveLongitudinal;
  }

  public PawnSMGameActiveLongitudinalLongitudinal getPawnSMGameActiveLongitudinalLongitudinal()
  {
    return pawnSMGameActiveLongitudinalLongitudinal;
  }

  public PawnSMGameActiveLongitudinalLongitudinalSouthBorder getPawnSMGameActiveLongitudinalLongitudinalSouthBorder()
  {
    return pawnSMGameActiveLongitudinalLongitudinalSouthBorder;
  }

  public PawnSMGameActiveLongitudinalLongitudinalNorthBorder getPawnSMGameActiveLongitudinalLongitudinalNorthBorder()
  {
    return pawnSMGameActiveLongitudinalLongitudinalNorthBorder;
  }

  public PawnSMGameActiveLatitudinal getPawnSMGameActiveLatitudinal()
  {
    return pawnSMGameActiveLatitudinal;
  }

  public PawnSMGameActiveLatitudinalLatitudinal getPawnSMGameActiveLatitudinalLatitudinal()
  {
    return pawnSMGameActiveLatitudinalLatitudinal;
  }

  public PawnSMGameActiveLatitudinalLatitudinalEastBorder getPawnSMGameActiveLatitudinalLatitudinalEastBorder()
  {
    return pawnSMGameActiveLatitudinalLatitudinalEastBorder;
  }

  public PawnSMGameActiveLatitudinalLatitudinalWestBorder getPawnSMGameActiveLatitudinalLatitudinalWestBorder()
  {
    return pawnSMGameActiveLatitudinalLatitudinalWestBorder;
  }

  public boolean gameCompleted()
  {
    boolean wasEventProcessed = false;
    
    PawnSM aPawnSM = pawnSM;
    switch (aPawnSM)
    {
      case gameActive:
        exitPawnSM();
        setPawnSM(PawnSM.gameComplete);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean stepMove(MoveDirection dir)
  {
    boolean wasEventProcessed = false;
    
    PawnSMGameActiveLongitudinalLongitudinal aPawnSMGameActiveLongitudinalLongitudinal = pawnSMGameActiveLongitudinalLongitudinal;
    PawnSMGameActiveLongitudinalLongitudinalSouthBorder aPawnSMGameActiveLongitudinalLongitudinalSouthBorder = pawnSMGameActiveLongitudinalLongitudinalSouthBorder;
    PawnSMGameActiveLongitudinalLongitudinalNorthBorder aPawnSMGameActiveLongitudinalLongitudinalNorthBorder = pawnSMGameActiveLongitudinalLongitudinalNorthBorder;
    PawnSMGameActiveLatitudinalLatitudinal aPawnSMGameActiveLatitudinalLatitudinal = pawnSMGameActiveLatitudinalLatitudinal;
    PawnSMGameActiveLatitudinalLatitudinalEastBorder aPawnSMGameActiveLatitudinalLatitudinalEastBorder = pawnSMGameActiveLatitudinalLatitudinalEastBorder;
    PawnSMGameActiveLatitudinalLatitudinalWestBorder aPawnSMGameActiveLatitudinalLatitudinalWestBorder = pawnSMGameActiveLatitudinalLatitudinalWestBorder;
    switch (aPawnSMGameActiveLongitudinalLongitudinal)
    {
      case Between:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.South)&&!(stepNearBorder(dir))&&!(stepOnBorder(dir)))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
        // line 29 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.North)&&!(stepNearBorder(dir))&&!(isStepOnBorder(dir)))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
        // line 31 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.South)&&stepNearBorder(dir))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
        // line 57 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.North)&&stepNearBorder(dir))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
        // line 59 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLongitudinalLongitudinalSouthBorder)
    {
      case nearBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.South))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalSouthBorder();
        // line 86 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.North))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 88 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.North))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalSouthBorder();
        // line 110 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLongitudinalLongitudinalNorthBorder)
    {
      case nearBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.South))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 139 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.North))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalNorthBorder();
        // line 141 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.South))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalNorthBorder();
        // line 160 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+1, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLatitudinalLatitudinal)
    {
      case Between:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.East)&&!(stepNearBorder(dir))&&!(stepOnBorder(dir)))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 244 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()+1);
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.West)&&!(stepNearBorder(dir))&&!(isStepOnBorder(dir)))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 246 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()-1);
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.East)&&stepNearBorder(dir))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 272 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()+1);
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.West)&&stepNearBorder(dir))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 274 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()-1);
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLatitudinalLatitudinalEastBorder)
    {
      case nearBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.East))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalEastBorder();
        // line 196 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()+1);
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.West))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 198 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()-1);
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.West))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalEastBorder();
        // line 220 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()-1);
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLatitudinalLatitudinalWestBorder)
    {
      case nearBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.East))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 320 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()+1);
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (isLegalStep(dir)&&dir.equals(MoveDirection.West))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalWestBorder();
        // line 322 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()-1);
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (isLegalStep(dir)&&dir.equals(MoveDirection.East))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalWestBorder();
        // line 361 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow(), getCurrentColumn()+1);
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean jumpMove(MoveDirection dir1,MoveDirection dir2)
  {
    boolean wasEventProcessed = false;
    
    PawnSMGameActiveLongitudinalLongitudinal aPawnSMGameActiveLongitudinalLongitudinal = pawnSMGameActiveLongitudinalLongitudinal;
    PawnSMGameActiveLongitudinalLongitudinalSouthBorder aPawnSMGameActiveLongitudinalLongitudinalSouthBorder = pawnSMGameActiveLongitudinalLongitudinalSouthBorder;
    PawnSMGameActiveLongitudinalLongitudinalNorthBorder aPawnSMGameActiveLongitudinalLongitudinalNorthBorder = pawnSMGameActiveLongitudinalLongitudinalNorthBorder;
    PawnSMGameActiveLatitudinalLatitudinal aPawnSMGameActiveLatitudinalLatitudinal = pawnSMGameActiveLatitudinalLatitudinal;
    PawnSMGameActiveLatitudinalLatitudinalEastBorder aPawnSMGameActiveLatitudinalLatitudinalEastBorder = pawnSMGameActiveLatitudinalLatitudinalEastBorder;
    PawnSMGameActiveLatitudinalLatitudinalWestBorder aPawnSMGameActiveLatitudinalLatitudinalWestBorder = pawnSMGameActiveLatitudinalLatitudinalWestBorder;
    switch (aPawnSMGameActiveLongitudinalLongitudinal)
    {
      case Between:
        if (dir1.equals(MoveDirection.North)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
        // line 37 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-2, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.South)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
        // line 39 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+2, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&(dir2.equals(MoveDirection.East)||dir2.equals(MoveDirection.West))&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir.equals(MoveDirection.South)&&(dir2.equals(MoveDirection.West)||dir2.equals(MoveDirection.East))&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.South)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpOnBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.South)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpOnBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&(dir2.equals(MoveDirection.East)||dir2.equals(MoveDirection.West))&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir.equals(MoveDirection.South)&&(dir2.equals(MoveDirection.West)||dir2.equals(MoveDirection.East))&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLongitudinalLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLongitudinalLongitudinalSouthBorder)
    {
      case nearBorder:
        if (dir1.equals(MoveDirection.North)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&(dir2.equals(MoveDirection.East)||dir2.equals(MoveDirection.West))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.South)&&(dir2.equals(MoveDirection.West)||dir2.equals(MoveDirection.East))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalSouthBorder();
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (dir1.equals(MoveDirection.North)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 115 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-2, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&(dir2.equals(MoveDirection.East)||dir2.equals(MoveDirection.West))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalSouthBorder();
          setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLongitudinalLongitudinalNorthBorder)
    {
      case nearBorder:
        if (dir1.equals(MoveDirection.South)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.North)&&(dir2.equals(MoveDirection.East)||dir2.equals(MoveDirection.West))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalNorthBorder();
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.South)&&(dir2.equals(MoveDirection.West)||dir2.equals(MoveDirection.East))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (dir1.equals(MoveDirection.South)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 166 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+2, getCurrentColumn());
          setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.South)&&(dir2.equals(MoveDirection.West)||dir2.equals(MoveDirection.East))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinalLongitudinalNorthBorder();
          setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLatitudinalLatitudinal)
    {
      case Between:
        if (dir1.equals(MoveDirection.West)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 252 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-2, getCurrentColumn());
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.East)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 254 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+2, getCurrentColumn());
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.West)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.East)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2)&&!(jumpNearBorder(dir1,dir2,1))&&!(jumpOnBorder(dir1,dir2)))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.West)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.East)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.West)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpOnBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.East)&&dir2.equals(null)&&isLegalJump(dir1,dir2)&&jumpOnBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.West)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 289 "../../../../../PawnStateMachine.ump"
          if(dir1==MoveDirection.South){
                    move(getCurrentRow()+1,getCurrentColumn()-1);
            }else{
          
            move(getCurrentRow()-1, getCurrentColumn()-1);    
            }
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.East)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2)&&jumpNearBorder(dir1,dir2,1))
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
        // line 298 "../../../../../PawnStateMachine.ump"
          if(dir1==MoveDirection.South){
                    move(getCurrentRow()+1,getCurrentColumn()+1);
            }else{
          
            move(getCurrentRow()-1, getCurrentColumn()+1);    
            }
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLatitudinalLatitudinalEastBorder)
    {
      case nearBorder:
        if (dir1.equals(MoveDirection.West)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.West)&&(dir2.equals(MoveDirection.North)||dir2.equals(MoveDirection.South))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir1.equals(MoveDirection.East)&&(dir2.equals(MoveDirection.North)||dir2.equals(MoveDirection.South))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalEastBorder();
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (dir1.equals(MoveDirection.West)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 225 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()-2, getCurrentColumn());
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.West)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalEastBorder();
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    switch (aPawnSMGameActiveLatitudinalLatitudinalWestBorder)
    {
      case nearBorder:
        if (dir1.equals(MoveDirection.East)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.West)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalWestBorder();
        // line 332 "../../../../../PawnStateMachine.ump"
          if(dir1==MoveDirection.South){
                    move(getCurrentRow()+1,getCurrentColumn()-1);
            }else{
          
            
            move(getCurrentRow()-1, getCurrentColumn()-1);
              
            }
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.East)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 345 "../../../../../PawnStateMachine.ump"
          if(dir1==MoveDirection.South){
                    move(getCurrentRow()+1,getCurrentColumn()+1);
            }else{
          
            
            move(getCurrentRow()-1, getCurrentColumn()+1);
              
            }
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        break;
      case OnBorder:
        if (dir1.equals(MoveDirection.East)&&dir2.equals(null)&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLongitudinal();
        // line 367 "../../../../../PawnStateMachine.ump"
          move(getCurrentRow()+2, getCurrentColumn());
          setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Between);
          wasEventProcessed = true;
          break;
        }
        if (dir2.equals(MoveDirection.East)&&(dir1.equals(MoveDirection.North)||dir1.equals(MoveDirection.South))&&isLegalJump(dir1,dir2))
        {
          exitPawnSMGameActiveLatitudinalLatitudinalWestBorder();
        // line 372 "../../../../../PawnStateMachine.ump"
          if(dir1==MoveDirection.South){
                    move(getCurrentRow()+1,getCurrentColumn()+1);
            }else{
          
            
            move(getCurrentRow()-1, getCurrentColumn()+1);
              
            }
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.nearBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition17__()
  {
    boolean wasEventProcessed = false;
    
    PawnSMGameActiveLatitudinal aPawnSMGameActiveLatitudinal = pawnSMGameActiveLatitudinal;
    switch (aPawnSMGameActiveLatitudinal)
    {
      case Latitudinal:
        if (hasGameAsWhite())
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition18__()
  {
    boolean wasEventProcessed = false;
    
    PawnSMGameActiveLatitudinal aPawnSMGameActiveLatitudinal = pawnSMGameActiveLatitudinal;
    switch (aPawnSMGameActiveLatitudinal)
    {
      case Latitudinal:
        if (hasGameAsBlack())
        {
          exitPawnSMGameActiveLatitudinalLatitudinal();
          setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.OnBorder);
          wasEventProcessed = true;
          break;
        }
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitPawnSM()
  {
    switch(pawnSM)
    {
      case gameActive:
        exitPawnSMGameActiveLongitudinal();
        exitPawnSMGameActiveLatitudinal();
        break;
    }
  }

  private void setPawnSM(PawnSM aPawnSM)
  {
    pawnSM = aPawnSM;

    // entry actions and do activities
    switch(pawnSM)
    {
      case gameActive:
        if (pawnSMGameActiveLongitudinal == PawnSMGameActiveLongitudinal.Null) { setPawnSMGameActiveLongitudinal(PawnSMGameActiveLongitudinal.Longitudinal); }
        if (pawnSMGameActiveLatitudinal == PawnSMGameActiveLatitudinal.Null) { setPawnSMGameActiveLatitudinal(PawnSMGameActiveLatitudinal.Latitudinal); }
        break;
      case gameComplete:
        // line 394 "../../../../../PawnStateMachine.ump"
        displayResults();
        break;
    }
  }

  private void exitPawnSMGameActiveLongitudinal()
  {
    switch(pawnSMGameActiveLongitudinal)
    {
      case Longitudinal:
        exitPawnSMGameActiveLongitudinalLongitudinal();
        setPawnSMGameActiveLongitudinal(PawnSMGameActiveLongitudinal.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLongitudinal(PawnSMGameActiveLongitudinal aPawnSMGameActiveLongitudinal)
  {
    pawnSMGameActiveLongitudinal = aPawnSMGameActiveLongitudinal;
    if (pawnSM != PawnSM.gameActive && aPawnSMGameActiveLongitudinal != PawnSMGameActiveLongitudinal.Null) { setPawnSM(PawnSM.gameActive); }

    // entry actions and do activities
    switch(pawnSMGameActiveLongitudinal)
    {
      case Longitudinal:
        if (pawnSMGameActiveLongitudinalLongitudinal == PawnSMGameActiveLongitudinalLongitudinal.Null) { setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Between); }
        break;
    }
  }

  private void exitPawnSMGameActiveLongitudinalLongitudinal()
  {
    switch(pawnSMGameActiveLongitudinalLongitudinal)
    {
      case Between:
        setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Null);
        break;
      case SouthBorder:
        exitPawnSMGameActiveLongitudinalLongitudinalSouthBorder();
        setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Null);
        break;
      case NorthBorder:
        exitPawnSMGameActiveLongitudinalLongitudinalNorthBorder();
        setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal aPawnSMGameActiveLongitudinalLongitudinal)
  {
    pawnSMGameActiveLongitudinalLongitudinal = aPawnSMGameActiveLongitudinalLongitudinal;
    if (pawnSMGameActiveLongitudinal != PawnSMGameActiveLongitudinal.Longitudinal && aPawnSMGameActiveLongitudinalLongitudinal != PawnSMGameActiveLongitudinalLongitudinal.Null) { setPawnSMGameActiveLongitudinal(PawnSMGameActiveLongitudinal.Longitudinal); }

    // entry actions and do activities
    switch(pawnSMGameActiveLongitudinalLongitudinal)
    {
      case SouthBorder:
        if (pawnSMGameActiveLongitudinalLongitudinalSouthBorder == PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null) { setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.nearBorder); }
        break;
      case NorthBorder:
        if (pawnSMGameActiveLongitudinalLongitudinalNorthBorder == PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null) { setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.nearBorder); }
        break;
    }
  }

  private void exitPawnSMGameActiveLongitudinalLongitudinalSouthBorder()
  {
    switch(pawnSMGameActiveLongitudinalLongitudinalSouthBorder)
    {
      case nearBorder:
        setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null);
        break;
      case OnBorder:
        setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLongitudinalLongitudinalSouthBorder(PawnSMGameActiveLongitudinalLongitudinalSouthBorder aPawnSMGameActiveLongitudinalLongitudinalSouthBorder)
  {
    pawnSMGameActiveLongitudinalLongitudinalSouthBorder = aPawnSMGameActiveLongitudinalLongitudinalSouthBorder;
    if (pawnSMGameActiveLongitudinalLongitudinal != PawnSMGameActiveLongitudinalLongitudinal.SouthBorder && aPawnSMGameActiveLongitudinalLongitudinalSouthBorder != PawnSMGameActiveLongitudinalLongitudinalSouthBorder.Null) { setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.SouthBorder); }

    // entry actions and do activities
    switch(pawnSMGameActiveLongitudinalLongitudinalSouthBorder)
    {
      case OnBorder:
        // line 106 "../../../../../PawnStateMachine.ump"
        testVictory();
        break;
    }
  }

  private void exitPawnSMGameActiveLongitudinalLongitudinalNorthBorder()
  {
    switch(pawnSMGameActiveLongitudinalLongitudinalNorthBorder)
    {
      case nearBorder:
        setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null);
        break;
      case OnBorder:
        setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLongitudinalLongitudinalNorthBorder(PawnSMGameActiveLongitudinalLongitudinalNorthBorder aPawnSMGameActiveLongitudinalLongitudinalNorthBorder)
  {
    pawnSMGameActiveLongitudinalLongitudinalNorthBorder = aPawnSMGameActiveLongitudinalLongitudinalNorthBorder;
    if (pawnSMGameActiveLongitudinalLongitudinal != PawnSMGameActiveLongitudinalLongitudinal.NorthBorder && aPawnSMGameActiveLongitudinalLongitudinalNorthBorder != PawnSMGameActiveLongitudinalLongitudinalNorthBorder.Null) { setPawnSMGameActiveLongitudinalLongitudinal(PawnSMGameActiveLongitudinalLongitudinal.NorthBorder); }

    // entry actions and do activities
    switch(pawnSMGameActiveLongitudinalLongitudinalNorthBorder)
    {
      case OnBorder:
        // line 158 "../../../../../PawnStateMachine.ump"
        testVictory();
        break;
    }
  }

  private void exitPawnSMGameActiveLatitudinal()
  {
    switch(pawnSMGameActiveLatitudinal)
    {
      case Latitudinal:
        exitPawnSMGameActiveLatitudinalLatitudinal();
        setPawnSMGameActiveLatitudinal(PawnSMGameActiveLatitudinal.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLatitudinal(PawnSMGameActiveLatitudinal aPawnSMGameActiveLatitudinal)
  {
    pawnSMGameActiveLatitudinal = aPawnSMGameActiveLatitudinal;
    if (pawnSM != PawnSM.gameActive && aPawnSMGameActiveLatitudinal != PawnSMGameActiveLatitudinal.Null) { setPawnSM(PawnSM.gameActive); }

    // entry actions and do activities
    switch(pawnSMGameActiveLatitudinal)
    {
      case Latitudinal:
        if (pawnSMGameActiveLatitudinalLatitudinal == PawnSMGameActiveLatitudinalLatitudinal.Null) { setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.EastBorder); }
        __autotransition17__();
        __autotransition18__();
        break;
    }
  }

  private void exitPawnSMGameActiveLatitudinalLatitudinal()
  {
    switch(pawnSMGameActiveLatitudinalLatitudinal)
    {
      case EastBorder:
        exitPawnSMGameActiveLatitudinalLatitudinalEastBorder();
        setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Null);
        break;
      case Between:
        setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Null);
        break;
      case WestBorder:
        exitPawnSMGameActiveLatitudinalLatitudinalWestBorder();
        setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal aPawnSMGameActiveLatitudinalLatitudinal)
  {
    pawnSMGameActiveLatitudinalLatitudinal = aPawnSMGameActiveLatitudinalLatitudinal;
    if (pawnSMGameActiveLatitudinal != PawnSMGameActiveLatitudinal.Latitudinal && aPawnSMGameActiveLatitudinalLatitudinal != PawnSMGameActiveLatitudinalLatitudinal.Null) { setPawnSMGameActiveLatitudinal(PawnSMGameActiveLatitudinal.Latitudinal); }

    // entry actions and do activities
    switch(pawnSMGameActiveLatitudinalLatitudinal)
    {
      case EastBorder:
        if (pawnSMGameActiveLatitudinalLatitudinalEastBorder == PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null) { setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.nearBorder); }
        break;
      case WestBorder:
        if (pawnSMGameActiveLatitudinalLatitudinalWestBorder == PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null) { setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.nearBorder); }
        break;
    }
  }

  private void exitPawnSMGameActiveLatitudinalLatitudinalEastBorder()
  {
    switch(pawnSMGameActiveLatitudinalLatitudinalEastBorder)
    {
      case nearBorder:
        setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null);
        break;
      case OnBorder:
        setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLatitudinalLatitudinalEastBorder(PawnSMGameActiveLatitudinalLatitudinalEastBorder aPawnSMGameActiveLatitudinalLatitudinalEastBorder)
  {
    pawnSMGameActiveLatitudinalLatitudinalEastBorder = aPawnSMGameActiveLatitudinalLatitudinalEastBorder;
    if (pawnSMGameActiveLatitudinalLatitudinal != PawnSMGameActiveLatitudinalLatitudinal.EastBorder && aPawnSMGameActiveLatitudinalLatitudinalEastBorder != PawnSMGameActiveLatitudinalLatitudinalEastBorder.Null) { setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.EastBorder); }

    // entry actions and do activities
    switch(pawnSMGameActiveLatitudinalLatitudinalEastBorder)
    {
      case OnBorder:
        // line 216 "../../../../../PawnStateMachine.ump"
        testVictory();
        break;
    }
  }

  private void exitPawnSMGameActiveLatitudinalLatitudinalWestBorder()
  {
    switch(pawnSMGameActiveLatitudinalLatitudinalWestBorder)
    {
      case nearBorder:
        setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null);
        break;
      case OnBorder:
        setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null);
        break;
    }
  }

  private void setPawnSMGameActiveLatitudinalLatitudinalWestBorder(PawnSMGameActiveLatitudinalLatitudinalWestBorder aPawnSMGameActiveLatitudinalLatitudinalWestBorder)
  {
    pawnSMGameActiveLatitudinalLatitudinalWestBorder = aPawnSMGameActiveLatitudinalLatitudinalWestBorder;
    if (pawnSMGameActiveLatitudinalLatitudinal != PawnSMGameActiveLatitudinalLatitudinal.WestBorder && aPawnSMGameActiveLatitudinalLatitudinalWestBorder != PawnSMGameActiveLatitudinalLatitudinalWestBorder.Null) { setPawnSMGameActiveLatitudinalLatitudinal(PawnSMGameActiveLatitudinalLatitudinal.WestBorder); }

    // entry actions and do activities
    switch(pawnSMGameActiveLatitudinalLatitudinalWestBorder)
    {
      case OnBorder:
        // line 359 "../../../../../PawnStateMachine.ump"
        testVictory();
        break;
    }
  }
  /* Code from template association_GetOne */
  public Game getCurrentGame()
  {
    return currentGame;
  }

  public boolean hasCurrentGame()
  {
    boolean has = currentGame != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Player getPlayer()
  {
    return player;
  }

  public boolean hasPlayer()
  {
    boolean has = player != null;
    return has;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setCurrentGame(Game aNewCurrentGame)
  {
    boolean wasSet = false;
    currentGame = aNewCurrentGame;
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOptionalOne */
  public boolean setPlayer(Player aNewPlayer)
  {
    boolean wasSet = false;
    player = aNewPlayer;
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    currentGame = null;
    player = null;
  }

}