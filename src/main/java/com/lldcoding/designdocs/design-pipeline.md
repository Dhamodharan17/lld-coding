Every LLD problem, regardless of domain, breaks down into those exact **3 fundamental phases**:

---

### The Universal LLD Execution Pipeline

```
  [ 1. CREATE / PREPARE DATA ] ──► [ 2. PERFORM ACTION / EXECUTE ] ──► [ 3. INFORM / NOTIFY SIDE EFFECTS ]
   (Entities & Builders)           (Strategies & Orchestrator)          (Observers & Pub-Sub)

```

---
### How to Apply This Mental Model to ANY Problem in Your Interview

If the interviewer gives you a completely unexpected problem, plug it directly into these 3 phases:

#### **Example 1: Parking Lot System**

1. **Create:** Instantiate `Vehicle("CAR-123")` and create/fetch available `ParkingSpot`.
2. **Perform Action:** Calculate fee using `FeeStrategy` and mark `spot.unpark()`.
3. **Inform:** Notify `DisplayBoardObserver` to update available spot count.

#### **Example 2: Chat Application**

1. **Create:** Construct `Message("Hello!")` and get receiver `User`.
2. **Perform Action:** Filter profanity, encrypt payload (`EncryptionStrategy`), save to DB.
3. **Inform:** Notify active `UserSessionObserver` or trigger `PushNotificationStrategy`.

#### **Example 3: Rate Limiter**

1. **Create:** Build `ClientRequest(userId, timestamp)`.
2. **Perform Action:** Execute rate-limit algorithm (`TokenBucketStrategy`) to check if allowed.
3. **Inform:** Log metrics or notify alert monitor if limit exceeded.

---

### Final Thought

Whenever you get stuck during the coding phase, just ask yourself:

* **"Have I created the entities?"** $\rightarrow$ Step 1
* **"Am I executing the main logic?"** $\rightarrow$ Step 2
* **"Did I notify external listeners?"** $\rightarrow$ Step 3

Keeping this 3-step mental loop in mind will ensure your code stays clean, organized, and complete under interview pressure. You're ready to crush it!