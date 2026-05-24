package com.smit.headlineHub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        return """
            <!DOCTYPE html>
            <html lang="en">

            <head>

                <meta charset="UTF-8">

                <meta name="viewport"
                      content="width=device-width, initial-scale=1.0">

                <title>
                    HeadlineHub Backend
                </title>

                <style>

                    * {

                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }

                    body {

                        min-height: 100vh;

                        display: flex;

                        align-items: center;

                        justify-content: center;

                        background:
                            linear-gradient(
                                135deg,
                                #020617,
                                #0f172a,
                                #111827
                            );

                        font-family:
                            Inter,
                            Arial,
                            sans-serif;

                        color: white;

                        overflow: hidden;
                    }

                    .background-glow {

                        position: absolute;

                        width: 500px;
                        height: 500px;

                        background:
                            radial-gradient(
                                circle,
                                rgba(37,99,235,0.25),
                                transparent 70%
                            );

                        filter: blur(60px);

                        z-index: 0;
                    }

                    .container {

                        position: relative;

                        z-index: 2;

                        width: 90%;
                        max-width: 850px;

                        background:
                            rgba(15,23,42,0.72);

                        backdrop-filter: blur(18px);

                        border:
                            1px solid rgba(255,255,255,0.08);

                        border-radius: 32px;

                        padding: 60px;

                        text-align: center;

                        box-shadow:
                            0 20px 80px rgba(0,0,0,0.45);
                    }

                    .badge {

                        display: inline-block;

                        padding:
                            10px 18px;

                        border-radius: 999px;

                        background:
                            rgba(37,99,235,0.12);

                        color: #60a5fa;

                        font-size: 13px;

                        font-weight: 700;

                        letter-spacing: 1px;

                        margin-bottom: 26px;
                    }

                    h1 {

                        font-size: 58px;

                        font-weight: 800;

                        margin-bottom: 20px;

                        background:
                            linear-gradient(
                                to right,
                                #ffffff,
                                #60a5fa
                            );

                        -webkit-background-clip: text;

                        -webkit-text-fill-color: transparent;
                    }

                    p {

                        color: #cbd5e1;

                        font-size: 18px;

                        line-height: 1.9;

                        max-width: 720px;

                        margin:
                            0 auto 36px;
                    }

                    .tech-stack {

                        display: flex;

                        flex-wrap: wrap;

                        justify-content: center;

                        gap: 14px;

                        margin-bottom: 40px;
                    }

                    .tech-stack span {

                        padding:
                            12px 18px;

                        border-radius: 14px;

                        background:
                            rgba(255,255,255,0.06);

                        border:
                            1px solid rgba(255,255,255,0.08);

                        font-size: 14px;

                        color: #e2e8f0;
                    }

                    .buttons {

                        display: flex;

                        justify-content: center;

                        gap: 18px;

                        flex-wrap: wrap;
                    }

                    .buttons a {

                        text-decoration: none;

                        padding:
                            16px 28px;

                        border-radius: 16px;

                        font-weight: 700;

                        transition: 0.25s ease;
                    }

                    .primary-btn {

                        background:
                            linear-gradient(
                                135deg,
                                #2563eb,
                                #3b82f6
                            );

                        color: white;

                        box-shadow:
                            0 12px 30px rgba(37,99,235,0.3);
                    }

                    .primary-btn:hover {

                        transform:
                            translateY(-3px);

                        box-shadow:
                            0 18px 40px rgba(37,99,235,0.4);
                    }

                    .secondary-btn {

                        background:
                            rgba(255,255,255,0.06);

                        border:
                            1px solid rgba(255,255,255,0.08);

                        color: white;
                    }

                    .secondary-btn:hover {

                        background:
                            rgba(255,255,255,0.12);

                        transform:
                            translateY(-3px);
                    }

                    .footer {

                        margin-top: 42px;

                        color: #64748b;

                        font-size: 14px;
                    }

                    @media (max-width: 768px) {

                        .container {

                            padding: 40px 28px;
                        }

                        h1 {

                            font-size: 40px;
                        }

                        p {

                            font-size: 16px;
                        }

                        .buttons {

                            flex-direction: column;
                        }

                        .buttons a {

                            width: 100%;
                        }
                    }

                </style>

            </head>

            <body>

                <div class="background-glow"></div>

                <div class="container">

                    <div class="badge">
                        HEADLINEHUB BACKEND API
                    </div>

                    <h1>
                        Spring Boot Powered News Engine
                    </h1>

                    <p>
                        This backend powers the HeadlineHub
                        full-stack news platform using Java,
                        Spring Boot, REST APIs and Dockerized
                        cloud deployment architecture.
                        It securely handles news aggregation,
                        API communication and scalable backend
                        processing for the frontend application.
                    </p>

                    <div class="tech-stack">

                        <span>Java 21</span>
                        <span>Spring Boot</span>
                        <span>REST API</span>
                        <span>Docker</span>
                        <span>Render</span>
                        <span>React</span>
                        <span>Supabase</span>

                    </div>

                    <div class="buttons">

                        <a
                            href="https://headline-hub-five.vercel.app"
                            target="_blank"
                            class="primary-btn"
                        >
                            Visit Frontend
                        </a>

                        <a
                            href="https://github.com/smitroy4/HeadlineHub"
                            target="_blank"
                            class="secondary-btn"
                        >
                            GitHub Repository
                        </a>

                    </div>

                    <div class="footer">

                        Developed by Smit Roy

                    </div>

                </div>

            </body>

            </html>
            """;
    }
}