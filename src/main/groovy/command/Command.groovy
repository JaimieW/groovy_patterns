package command

interface Command {
	void execute()
	void undo()
}
