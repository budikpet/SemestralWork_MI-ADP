package cz.cvut.fit.miadp.mvcgame.command;

import cz.cvut.fit.miadp.mvcgame.model.IGameModel;

public class UndoLastCommand extends AbsCommand {
    public UndoLastCommand(IGameModel receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.undoLastCmd();
    }

}
