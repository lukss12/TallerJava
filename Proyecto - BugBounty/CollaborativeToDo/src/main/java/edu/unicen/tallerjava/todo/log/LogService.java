package edu.unicen.tallerjava.todo.log;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.unicen.tallerjava.todo.users.User;

@Service
public class LogService {
	List<Log> logs = new ArrayList<>();

	public List<Log> getLogs() {
		return logs;
	}

	public void addLog(String action, User user) {
		Log log = new Log(UUID.randomUUID(), action, user);
		logs.add(log);
	}
}
