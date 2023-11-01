package multithreding;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

	public static void main(String[] args) throws InterruptedException {
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();

		if (l.tryLock()) {
			System.out.println("Perform Safe Operations");
		} else {
			System.out.println("Perform Alternate Operations");
		}
		if (l.tryLock(1000, TimeUnit.MILLISECONDS)) {
			System.out.println("Perform Safe with Waiting Operations");
		} else {
			System.out.println("Perform Safe without Waiting Operations");
		}

		System.out.println("l.isLocked() : " + l.isLocked()); // true
		System.out.println("l.isHeldByCurrentThread() : " + l.isHeldByCurrentThread()); // true
		System.out.println("l.getQueueLength() : " + l.getQueueLength()); // 0
		l.unlock();
		System.out.println("l.getHoldCount() : " + l.getHoldCount()); // 1
		System.out.println("l.isLocked() : " + l.isLocked()); // true
		l.unlock();
		System.out.println("l.isLocked() : " + l.isLocked()); // false
		System.out.println("l.isFair() : " + l.isFair()); // false
	}

}
