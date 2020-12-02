package ch05;

public interface CommandAction {
	void action();
}

class WriteAction implements CommandAction{
	@Override
	public void action() {
		System.out.println("Write");
	}
}

class ReadAction implements CommandAction{
	@Override
	public void action() {
		System.out.println("Read");
	}
}

class ListAction implements CommandAction{
	@Override
	public void action() {
		System.out.println("List");
	}
}

class ReplyAction implements CommandAction{
	@Override
	public void action() {
		System.out.println("Reply");
	}
}

class UpdateAction implements CommandAction{
	@Override
	public void action() {
		System.out.println("Update");
	}
}

class DeleteAction implements CommandAction{
	@Override
	public void action() {
		System.out.println("Delete");
	}
}