# Object-Oriented Design (OOD) 5-Step Framework

This framework provides a structured 5-step methodology to tackle any Object-Oriented Design (OOD) / Low-Level Design (LLD) interview problem effectively.

---

## The 5-Step Overview

1. **Clarify Requirements**
2. **Identify Core Entities**
3. **Design Classes and Interfaces**
4. **Apply Design Patterns**
5. **Walk Through Use Cases and Edge Cases**

---

## Step 1: Clarify Requirements (3–5 mins)

### What to Ask
Focus your questions across four core categories:
* **Functional Requirements:** What features should the system support?
* **Actors:** Who are the different types of users?
* **Constraints and Scope:** Limit scope down to a manageable set of core features.
* **Non-Functional Considerations:** Multithreading, scalability, or memory bounds.

**Sample Clarification:**
> *"Should the system support the full Stack Overflow feature set, or should I focus strictly on core Q&A functionality?"*

---

## Step 2: Identify Core Entities (3–5 mins)

Shift focus from system features to objects—what are the fundamental "things" in this system?

### The Noun Extraction Technique
Go through your clarified requirements and **underline every noun** to reveal candidate entities.

### Tips for Identifying Entities
* **Start with 4–6 core entities:** Do not capture everything upfront. Start with the obvious ones and add more as the design evolves.
* **Group related concepts:** Extract shared behavior later using interfaces or abstract classes.
* **Ignore implementation details:** Avoid worrying about specific data types or method signatures at this stage.
* **Sketch relationships early:** Mentalize connections (one-to-one, one-to-many) as you identify entities.

---

## Step 3: Design Classes and Interfaces (20–25 mins)

Convert the identified entities into a cohesive class structure featuring attributes, relationships, interfaces, and a clean public API.

### 3.1 Define Classes, Attributes, and Relationships
Convert each entity into a class with key attributes. For each class, evaluate:
1. What data does this object hold?
2. What other objects does it reference?
3. What is the relationship type (*one-to-one*, *one-to-many*, or *many-to-many*)?

**Example:**
> A `Question` holds a title, body, creation date, and status. It belongs to one `User`, has many `Answer`s, many `Comment`s, many `Tag`s, and many `Vote`s.

**Explaining Relationship Choices:**
> *"I am using composition here because a `Question` owns its `Answer`s. If a question is deleted, its answers are removed as well. However, `Tag`s are shared across questions, so that is an association rather than composition."*

### 3.2 Define Interfaces and Core Methods
Look across your classes to identify shared behavior. Use the **Verb Extraction Technique**: scan requirements for actions (verbs) to define method signatures and interfaces.

### 3.3 Define a Central Manager Class
Introduce a single entry point for the system using the **Facade Pattern**. This central manager coordinates major operations and hides internal component complexity.

---

## Step 4: Apply Design Patterns (5–7 mins)

Apply patterns only where they solve concrete design problems—never force them. One or two well-justified patterns carry more weight than multiple unused ones.

### How to Discuss Patterns
When proposing a pattern, explicitly state:
1. **What pattern** you are using and where it applies.
2. **Why** you chose it (the specific problem it solves).
3. **How** it improves extensibility or maintainability.

---

## Step 5: Walk Through Use Cases and Edge Cases (5–10 mins)

Walk through a key use case end-to-end (or sketch a sequence diagram) to prove that your classes collaborate correctly.

### Key Edge Cases
Demonstrate strong production engineering awareness:
* Identify 3–4 key edge cases (e.g., race conditions, null references, deleted resource access).
* Provide concrete validation or synchronization logic for 1–2 critical scenarios.