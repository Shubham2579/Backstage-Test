# Unisys Migration Assistant Platform

The Unisys Migration Assistant Platform is a multi-module modernization tool designed to analyze legacy codebases and assist in migration and modernization processes.

The platform provides automated code assessment, AI-powered analysis, and developer tooling through an Eclipse plugin.

## Architecture Overview

The platform consists of the following modules:

| Module | Description |
|------|-------------|
| assessment-service | Core service responsible for analyzing source code |
| genai-service | AI-based analysis engine |
| template-config | Configuration and templates for report generation |
| eclipse-plugin | Eclipse IDE plugin used to run assessments |

## System Architecture

Eclipse Plugin  
      ↓  
Assessment Service  
      ↓  
GenAI Service  
      ↓  
Template Config

## Technology Stack

- Java 17
- Spring Boot
- Maven Multi-Module
- OpenAPI
- Eclipse Plugin Development
- AI-powered code analysis

## Project Structure
