# Technical Interview Preparation Roadmap

A subject-wise master checklist for fresher Software Developer, Full Stack Developer and related entry-level interviews.

> Use this file to decide what to study. Keep detailed explanations, notes and solved answers in separate subject files. Prioritize the job description and the technologies you actually mention on your resume.

## How to prepare every topic

For each concept, prepare:
1. Meaning: What is it?
2. Purpose: Why is it needed? What problem does it solve?
3. Working: How does it work?
4. Example: Where would you use it?
5. Comparison: What similar concept is it confused with?
6. Interview practice: definition, difference, output, practical and scenario questions.

For coding topics, also practise edge cases, debugging, time complexity and space complexity.

---

## 1. Programming language fundamentals

Prepare the languages relevant to the role and your resume. Aim for strong fundamentals in your primary languages rather than shallow knowledge of everything.

**Common topics**
- Variables, constants, data types, operators and type conversion.
- Conditions, loops, functions/methods, parameters, return values and scope.
- Arrays, strings, collections and basic input/output.
- Recursion, exceptions and debugging.
- Value vs reference types, stack vs heap and memory basics.
- Compile-time vs runtime; compiler vs interpreter.

**Language-specific checklist**

**C:** pointers, arrays and strings, structures/unions, dynamic memory (`malloc`, `calloc`, `realloc`, `free`), storage classes, call by value, pointer-based modification.

**C#:** value vs reference types, `var`/`dynamic`/`object`, properties, constructors, access modifiers, `static`/`readonly`/`const`, collections, generics, delegates/events, LINQ, exceptions, `async`/`await`, garbage collection and `IDisposable`.

**Java:** JDK/JRE/JVM, primitive vs reference types, String/StringBuilder/StringBuffer, constructors, `this`/`super`, access modifiers, `static`/`final`/`abstract`, collections, checked vs unchecked exceptions, overloading/overriding, multithreading basics.

**Python:** list/tuple/set/dictionary, mutability, identity vs equality, slicing, comprehensions, functions and scope, iterators/generators, exceptions, modules, OOP basics.

**JavaScript:** `var`/`let`/`const`, scope, hoisting, temporal dead zone, closures, `this`, `==` vs `===`, callbacks, promises, `async`/`await`, event loop, array methods, DOM, ES6 modules/destructuring/spread.

**Typical questions**
- Compiler vs interpreter?
- What is type casting?
- What is recursion?
- Array vs linked list?
- What is exception handling?
- Value type vs reference type?
- `==` vs `===` in JavaScript?
- What happens when a function is called?

**Practise:** output prediction, correcting errors, and small programs using loops, arrays, strings and functions.

---

## 2. Object-Oriented Programming (OOP)

**Topics**
- Class and object.
- Encapsulation, abstraction, inheritance and polymorphism.
- Compile-time vs runtime polymorphism.
- Overloading vs overriding.
- Constructors and access modifiers.
- Interface vs abstract class.
- `this`, `super`/`base` and static members.
- Association, aggregation and composition.
- SOLID principles basics.

**Typical questions**
1. What is OOP and why is it used?
2. Class vs object?
3. Explain the four pillars with examples.
4. Encapsulation vs abstraction?
5. What are the types of inheritance?
6. Overloading vs overriding?
7. Interface vs abstract class?
8. Can constructors be overloaded?
9. Composition vs inheritance?
10. What are SOLID principles?

**Practise:** write a small code example for each OOP pillar, identify OOP concepts in code, and explain examples from real applications.

---

## 3. Data Structures and Algorithms (DSA)

**Data structures**
- Arrays, strings and linked lists.
- Stacks and queues.
- Hash maps, hash sets and hashing.
- Trees, binary search trees and traversals.
- Heaps and priority queues.
- Graphs, BFS and DFS.

**Algorithms and techniques**
- Linear and binary search.
- Bubble, selection, insertion, merge and quick sort.
- Recursion and backtracking basics.
- Two pointers, sliding window and prefix sums.
- Greedy and dynamic programming fundamentals.

**Complexity**
- Big-O notation.
- Time vs space complexity.
- Best, average and worst cases.
- Complexity of common operations.

**Typical coding questions**
- Check whether a number is prime; find the nth prime.
- Reverse a string or number; check a palindrome.
- Find largest and second-largest array elements.
- Remove duplicates; find element frequencies.
- Two Sum; missing number in an array.
- Check whether two strings are anagrams.
- Longest substring without repeating characters.
- Implement binary search, stack or queue.
- Detect a linked-list cycle; traverse a tree.

**For every problem:** clarify input/output, explain brute force, optimize if possible, code clearly, test edge cases, and state complexity.

---

## 4. DBMS and SQL

**DBMS concepts**
- Database, DBMS, RDBMS, schema, tables and constraints.
- Primary, foreign, candidate and composite keys.
- One-to-one, one-to-many and many-to-many relationships.
- Functional dependency and normalization: 1NF, 2NF, 3NF, BCNF basics.
- Transactions and ACID.
- Indexes and trade-offs.
- Views, stored procedures, functions and triggers.
- SQL vs NoSQL; ER diagrams and database design.

**SQL**
- DDL, DML, DQL, DCL and TCL.
- CREATE, ALTER, DROP, TRUNCATE, INSERT, UPDATE, DELETE, SELECT.
- WHERE, ORDER BY, GROUP BY, HAVING.
- Aggregate functions and joins (INNER, LEFT, RIGHT, FULL where supported).
- Subqueries, correlated subqueries, IN, EXISTS, BETWEEN, LIKE.
- UNION vs UNION ALL; NULL handling.
- Window functions: ROW_NUMBER, RANK, DENSE_RANK.
- Conceptual SQL query execution order.

**Typical questions**
1. DBMS vs RDBMS?
2. Primary key vs foreign key?
3. What is normalization?
4. Explain ACID.
5. What is an index? Do more indexes always improve performance?
6. DELETE vs TRUNCATE vs DROP?
7. WHERE vs HAVING?
8. Explain SQL joins.
9. UNION vs UNION ALL?
10. How do you find duplicate records or the second-highest salary?

**Practise queries:** filtering, sorting, grouping, joins, duplicate detection, top-N/ranking, subqueries and finding unmatched records.

---

## 5. Operating Systems (OS)

**Topics**
- OS purpose, kernel and user mode.
- Process vs thread; process states and PCB.
- Context switching.
- CPU scheduling: FCFS, SJF, Priority, Round Robin.
- Concurrency, parallelism, race conditions and critical sections.
- Mutex and semaphore.
- Deadlock and its four necessary conditions.
- Paging, segmentation, virtual memory and page faults.
- System calls and file systems.

**Typical questions**
- What is an operating system?
- Process vs thread?
- What are process states?
- What is context switching?
- What is deadlock? What are its four conditions?
- Mutex vs semaphore?
- What is virtual memory and paging?
- What is a system call?

**Practise:** draw process-state diagrams, solve small scheduling examples, and explain deadlock with an example.

---

## 6. Computer Networks (CN)

**Topics**
- LAN, MAN, WAN.
- OSI and TCP/IP models; purpose of each layer.
- IP address, MAC address and port.
- IPv4 vs IPv6; public vs private IP.
- TCP vs UDP.
- DNS, DHCP and ARP.
- HTTP vs HTTPS, methods and status codes.
- Router vs switch, firewall.
- Client-server architecture, cookies and sessions.
- Basic subnetting.

**Typical questions**
- Explain the OSI model.
- TCP vs UDP?
- IP address vs MAC address?
- What happens when you enter a URL in a browser?
- What is DNS, DHCP and ARP?
- HTTP vs HTTPS?
- Router vs switch?
- What are common HTTP status-code categories?

**Practise:** explain a browser request from URL entry to page loading and map common protocols to network layers.

---

## 7. Web Development Fundamentals

**HTML**
- Document structure, semantic tags, forms, inputs, tables, lists and accessibility basics.
- Block vs inline elements; attributes.

**CSS**
- Selectors and specificity.
- Box model; margin vs padding.
- Display, positioning, Flexbox and Grid.
- Pseudo-classes/elements.
- Responsive design, media queries and units.

**Browser JavaScript**
- DOM and BOM.
- DOM selection and updates.
- Event handling and event bubbling.
- Form validation, Fetch API and JSON.
- localStorage vs sessionStorage vs cookies.

**Typical questions**
- What is semantic HTML?
- `id` vs `class`?
- Explain the CSS box model and specificity.
- Flexbox vs Grid?
- What is responsive design?
- What is the DOM and event bubbling?
- localStorage vs sessionStorage?

---

## 8. Frontend: React and TypeScript

**React**
- Components, JSX and functional components.
- Props vs state; rendering and state updates.
- Hooks: useState, useEffect, useRef, useMemo, useCallback, useContext.
- Conditional rendering, lists and keys.
- Controlled vs uncontrolled components.
- Forms, validation and routing.
- API integration, loading/error states.
- Context API and state management basics.
- Virtual DOM and performance basics.
- React vs Next.js.

**TypeScript**
- Type annotations and inference.
- Interfaces vs type aliases.
- Union/intersection types, optional properties and generics.
- Type narrowing; any vs unknown.
- Typing component props and state.

**Typical questions**
- What is React and JSX?
- Props vs state?
- What are hooks?
- Why useEffect? What does its dependency array do?
- Why do lists need keys?
- What is a controlled component?
- What is the Virtual DOM?
- React vs Next.js?
- JavaScript vs TypeScript?
- Interface vs type?

---

## 9. Backend Development and REST APIs

**Topics**
- Client-server architecture and request-response lifecycle.
- Routing, controllers and middleware.
- REST principles and HTTP methods: GET, POST, PUT, PATCH, DELETE.
- Status codes, headers, body, route params and query params.
- Authentication vs authorization; sessions vs tokens; JWT basics.
- Input validation, error handling and logging.
- CORS, environment variables and configuration.
- Pagination, filtering, sorting and rate limiting.
- API security basics.

**Node.js and Express**
- Node.js runtime and non-blocking I/O.
- npm, modules and package management.
- Express routes and middleware order.
- Async operations and error-handling middleware.
- Database connectivity.

**Typical questions**
- What is a REST API?
- GET vs POST? PUT vs PATCH?
- What is middleware?
- Authentication vs authorization?
- What is JWT?
- What is CORS?
- Route params vs query params?
- How do you handle API errors?
- Synchronous vs asynchronous code?

---

## 10. .NET and C# / ASP.NET Core

Prioritize this section for .NET roles and projects.

**C#**
- OOP, value/reference types, collections and generics.
- Exceptions, delegates, events and LINQ.
- async/await, garbage collection and IDisposable.

**.NET platform**
- .NET vs .NET Framework.
- CLR, CTS and CLS.
- JIT compilation.
- Managed vs unmanaged code.
- Assemblies and metadata; garbage collection.

**ASP.NET Core**
- MVC and Web API.
- Routing and middleware pipeline.
- Dependency injection and Singleton/Scoped/Transient lifetimes.
- Configuration and appsettings.
- Model binding, validation and filters.
- Authentication and authorization.
- Entity Framework Core, migrations and LINQ.
- Code-first vs database-first.
- IEnumerable vs IQueryable.

**Typical questions**
- What is CLR? What is JIT?
- .NET Framework vs modern .NET?
- What is dependency injection?
- Explain service lifetimes.
- What is middleware?
- MVC vs Web API?
- What is EF Core?
- What is model binding?
- IEnumerable vs IQueryable?

---

## 11. Software Engineering and Development Practices

**Topics**
- SDLC and its phases.
- Agile, Scrum, sprint, backlog and user stories.
- Functional vs non-functional requirements.
- Unit, integration, system and acceptance testing.
- Debugging, logging and code reviews.
- Clean code and maintainability.
- Layered architecture and client-server architecture.
- Basic design patterns: Singleton, Factory, Repository, Observer.
- Basic security and testing practices.

**Typical questions**
- What is SDLC?
- What is Agile and Scrum?
- Functional vs non-functional requirements?
- Unit vs integration testing?
- Debugging vs testing?
- What is a design pattern?
- Why are code reviews important?

---

## 12. Git, GitHub and Development Tools

**Git topics**
- Version control, repository, working directory and staging area.
- init, clone, status, add, commit, push, pull and fetch.
- Branching, merging and merge-conflict resolution.
- Merge vs rebase.
- origin vs upstream.
- stash; reset vs revert.
- .gitignore, pull requests and code reviews.

**Tools**
- GitHub workflow.
- Postman: methods, headers, body, params and environments.
- IDE debugging and browser developer tools.
- npm and NuGet package managers.
- API testing and logs.

**Typical questions**
- Git vs GitHub?
- What is a commit and staging area?
- fetch vs pull?
- What is a merge conflict?
- merge vs rebase?
- reset vs revert?
- What is a pull request?

---

## 13. Project Explanation and Architecture

Interviewers may ask detailed follow-up questions about every project on your resume.

For each project prepare:

**Overview**
- What problem does it solve?
- Who uses it?
- What are its main features?
- What did you personally implement?
- Why did you choose the stack?

**Technical depth**
- Architecture and request flow.
- Frontend, backend and database responsibilities.
- Database schema and relationships.
- APIs or server actions.
- Authentication and authorization.
- Validation and error handling.
- Important libraries and their purpose.
- Deployment and environment configuration.

**Problem-solving**
- Biggest technical challenge.
- A bug and how you debugged it.
- A design or technology decision.
- What you would improve.
- How you would handle more users or data.

**Projects to prepare**
- ProjecTrack: role-based access, authentication, schema, project workflows and Next.js architecture.
- HeartSense AI: dataset, preprocessing, model selection, prediction flow and limitations.
- NeuroFace: CNN basics, facial landmarks, model training and frontend/backend integration.
- AI Support Desk: API design, ticket categorization, AI integration and database workflow.

Be accurate about what is completed, partial or planned. Clearly explain your own contribution.

---

## 14. Basic AI/ML Concepts

Prioritize this for AI-related roles or when discussing AI/ML projects.

**Topics**
- AI vs ML vs Deep Learning.
- Supervised vs unsupervised learning.
- Classification vs regression.
- Features, labels and train/validation/test data.
- Data preprocessing.
- Overfitting and underfitting; bias and variance basics.
- Decision Tree, Random Forest, Logistic Regression and KNN.
- CNN fundamentals.
- Confusion matrix, accuracy, precision, recall and F1-score.
- Model evaluation and limitations.
- Generative AI, LLMs, API integration and responsible use of AI outputs.

**Typical questions**
- AI vs ML vs Deep Learning?
- Classification vs regression?
- Why split data into training and testing sets?
- What is overfitting?
- What is a confusion matrix?
- Precision vs recall?
- Why can accuracy be misleading?
- What is a Decision Tree or CNN?
- What is an LLM and what are its limitations?

---

## 15. Aptitude and Reasoning

Keep detailed aptitude practice in a separate folder.

- Quantitative: percentages, ratios, averages, profit/loss, time/work, speed/distance, probability, permutations and combinations.
- Logical reasoning: series, arrangements, directions, blood relations, syllogisms and puzzles.
- Verbal: grammar, comprehension, sentence correction and vocabulary.
- Data interpretation: tables, charts and graphs.

Practise timed questions and review mistakes, not just the number of questions solved.

---

## 16. Recommended study priority

For general fresher Software Developer / Full Stack roles, start here. Adjust based on each job description.

| Priority | Subject | Focus |
|---|---|---|
| 1 | Programming fundamentals | Logic, syntax, output questions |
| 2 | OOP | Four pillars, examples, comparisons |
| 3 | DBMS and SQL | Queries, joins, keys, normalization |
| 4 | DSA and coding | Arrays, strings, searching, sorting |
| 5 | Projects | Architecture, contribution, challenges |
| 6 | Role-specific stack | React/Node or .NET/C# |
| 7 | OS | Processes, threads, memory, deadlocks |
| 8 | CN | OSI, TCP/IP, DNS, HTTP, TCP/UDP |
| 9 | Git and tools | Branching, conflicts, API testing |
| 10 | Software engineering | SDLC, Agile, testing |
| 11 | AI/ML | Prioritize for AI-related roles |

---

## 17. Subject completion checklist

Do not mark a subject complete just because you have read its notes.

- [ ] I can explain the main concepts without reading.
- [ ] I can define important terms accurately.
- [ ] I can answer basic interview questions.
- [ ] I can compare commonly confused concepts.
- [ ] I can solve practical questions or write code/queries.
- [ ] I can explain at least one real-world use case.
- [ ] I can answer follow-ups such as why, how and what if.
- [ ] I have revised the subject after a gap.

**Confidence scale**

| Level | Meaning |
|---|---|
| 0 — Not started | Have not studied it. |
| 1 — Familiar | Recognize terms but cannot explain them. |
| 2 — Basic | Can explain definitions and simple examples. |
| 3 — Interview ready | Can answer common questions and solve basic problems. |
| 4 — Strong | Can handle follow-ups, scenarios and practical applications. |

---

## 18. Five interview question styles to practise

For every subject, practise:
1. **Definition:** What is it?
2. **Difference:** How is X different from Y?
3. **Working:** How does it work internally?
4. **Application:** Where and why is it used?
5. **Scenario:** What happens if a condition changes?

Example — database indexes:
- Definition: What is an index?
- Difference: Clustered vs non-clustered index (where supported).
- Working: How does an index help locate records?
- Application: When would you add an index?
- Scenario: What could happen if a frequently updated table has too many indexes?

---

## 19. Final preparation rules

- Prioritize the job description and your resume.
- Understand fundamentals before memorizing advanced terms.
- Do not study every language and framework at equal depth.
- Practise writing code and SQL without relying on autocomplete.
- Explain your own projects honestly and in detail.
- Revise common comparisons and output-based questions.
- Keep a list of questions you could not answer in interviews.
- Revisit mistakes and weak topics regularly.

**Goal:** Build strong fundamentals, demonstrate problem-solving, explain your own work clearly, and show that you can learn the technologies required by the role.
